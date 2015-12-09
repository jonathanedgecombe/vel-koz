package at.lolst.api.request;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import at.lolst.api.Config;

public final class Cache {
	private final static int CHECK_TIMEOUT = 1000;

	private final Config config;
	private final Map<Request<?>, CacheEntry<?>> cache;
	private final Deque<Request<?>> priorityQueue;

	private long lastCheck = System.currentTimeMillis();

	public Cache(Config config) {
		this.config = config;
		this.cache = new HashMap<>();
		this.priorityQueue = new ArrayDeque<Request<?>>(config.getCacheSize());
	}

	public synchronized <T> void cache(Request<T> request, Result<T> value, boolean aggregate, long timeout) {
		long time = System.currentTimeMillis();

		if (time - lastCheck > CHECK_TIMEOUT) {
			lastCheck = time;

			Iterator<Entry<Request<?>, CacheEntry<?>>> iterator = cache.entrySet().iterator();

			while (iterator.hasNext()) {
				Entry<Request<?>, CacheEntry<?>> entry = iterator.next();
				if (entry.getValue().expired()) {
					iterator.remove();
					priorityQueue.remove(entry.getKey());
				}
			}
		}

		if (aggregate) {
			Optional<RequestAggregator<T>> aggreagtor = request.getAggregator();
	
			if (aggreagtor.isPresent()) {
				aggreagtor.get().cache(request, value, this, timeout);
				return;
			}
		}

		if (priorityQueue.size() == config.getCacheSize()) {
			Request<?> head = priorityQueue.poll();
			cache.remove(head);
		}

		cache.put(request, new CacheEntry<T>(value, timeout));
		priorityQueue.add(request);
	}

	@SuppressWarnings("unchecked")
	public synchronized <T> Optional<Result<T>> check(Request<T> request) {
		Optional<CacheEntry<T>> entry = Optional.ofNullable((CacheEntry<T>) cache.get(request));
		if (!entry.isPresent()) return Optional.empty();

		if (entry.get().expired()) {
			cache.remove(request);
			priorityQueue.remove(request);
			return Optional.empty();
		}

		return Optional.of(entry.get().getResult());
	}
}
