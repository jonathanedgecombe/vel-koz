package at.lolst.api.request;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import at.lolst.api.Config;
import at.lolst.api.Future;

/**
 * 
 * @author jonathan
 *
 */
public final class Cache {
	private final static int CHECK_TIMEOUT = 1000;

	private final Config config;
	private final Map<Request<?>, CacheEntry<?>> cache;
	private final Deque<Request<?>> priorityQueue;

	private final Map<Request<?>, List<Request<?>>> executing = new HashMap<>();
	private final Map<Request<?>, Future> executingFutures = new HashMap<>();

	private long lastCheck = System.currentTimeMillis();

	public Cache(Config config) {
		this.config = config;
		this.cache = new HashMap<>();
		this.priorityQueue = new ArrayDeque<Request<?>>(config.getCacheSize());
	}

	public <T> boolean isExecuting(Request<T> request) {
		return executing.containsKey(request);
	}

	public <T> Future onExecute(Request<T> request) {
		List<Request<?>> requests = executing.get(request);
		requests.add(request);
		return executingFutures.get(request);
	}

	public <T> void startExecuting(Request<T> request, Future future) {
		executing.put(request, new ArrayList<>());
		executingFutures.put(request, future);
	}

	@SuppressWarnings("unchecked")
	public <T> void finishExecuting(final Request<T> request, Result<T> result) {
		Optional<List<Request<?>>> requests = Optional.ofNullable(executing.get(request));
		requests.ifPresent(req -> req.forEach(r -> ((Request<T>) r).onCompletion.accept(result)));

		executing.remove(request);
		executingFutures.remove(request);
	}

	public <T> void finishExecutingError(Request<T> request, Throwable error) {
		Optional<List<Request<?>>> requests = Optional.ofNullable(executing.get(request));
		requests.ifPresent(req -> req.forEach(r -> r.onError.accept(error)));

		executing.remove(request);
		executingFutures.remove(request);
	}

	public Map<Request<?>, List<Request<?>>> getExecuting() {
		return executing;
	}

	public synchronized <T> void cache(Request<T> request, Result<T> value, boolean aggregate) {
		long time = System.currentTimeMillis();

		if (time - lastCheck > CHECK_TIMEOUT) {
			lastCheck = time;

			Iterator<Entry<Request<?>, CacheEntry<?>>> iterator = cache.entrySet().iterator();

			while (iterator.hasNext()) {
				Entry<Request<?>, CacheEntry<?>> entry = iterator.next();
				Optional<Integer> timeout = config.getTimeout(request);

				if (timeout.isPresent()) {
					long diff = time - entry.getValue().getTime();

					if (diff > timeout.get()) {
						iterator.remove();
						priorityQueue.remove(entry.getKey());
					}
				}
			}
		}

		if (aggregate) {
			Optional<RequestAggregator<T>> aggreagtor = request.getAggregator();
	
			if (aggreagtor.isPresent()) {
				aggreagtor.get().cache(request, value, this);
				return;
			}
		}

		if (priorityQueue.size() == config.getCacheSize()) {
			Request<?> head = priorityQueue.poll();
			cache.remove(head);
		}

		cache.put(request, new CacheEntry<T>(value));
		priorityQueue.add(request);
	}

	@SuppressWarnings("unchecked")
	public synchronized <T> Optional<Result<T>> check(Request<T> request) {
		Optional<CacheEntry<T>> entry = Optional.ofNullable((CacheEntry<T>) cache.get(request));
		if (!entry.isPresent()) return Optional.empty();

		Optional<Integer> timeout = config.getTimeout(request);
		if (!timeout.isPresent()) return Optional.of(entry.get().getResult());

		long diff = System.currentTimeMillis() - entry.get().getTime();
		if (diff > timeout.get()) {
			cache.remove(request);
			priorityQueue.remove(request);
			return Optional.empty();
		}

		return Optional.of(entry.get().getResult());
	}
}
