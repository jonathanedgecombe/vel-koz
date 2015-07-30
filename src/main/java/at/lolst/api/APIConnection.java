package at.lolst.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import at.lolst.api.request.Cache;
import at.lolst.api.request.RequestDispatcher;
import at.lolst.api.request.Request;

/**
 * 
 * @author jonathan
 *
 */
public final class APIConnection {
	private final List<RateLimit> rateLimits = new ArrayList<>();
	private final Cache cache;
	private final RequestDispatcher dispatcher;

	public APIConnection(String key, Config config, RateLimit... rateLimits) {
		this.cache = new Cache(config);
		this.dispatcher = new RequestDispatcher(cache, key);

		for (RateLimit rateLimit : rateLimits) {
			addRateLimit(rateLimit);
		}
	}

	public List<RateLimit> getRateLimits() {
		return rateLimits;
	}

	public void addRateLimit(RateLimit rateLimit) {
		rateLimits.add(rateLimit);
	}

	public void addRateLimits(RateLimit... rateLimits) {
		for (RateLimit rateLimit : rateLimits) {
			addRateLimit(rateLimit);
		}
	}

	public void waitForRateLimits() throws InterruptedException {
		for (RateLimit limit : rateLimits) {
			limit.acquire();
		}
	}

	/**
	 * Execute a request.
	 * 
	 * @param request
	 * @return Future for the request.
	 * @throws InterruptedException
	 */
	public <T> Future execute(Request<T> request) throws InterruptedException {
		synchronized (cache.getExecuting()) {
			if (cache.isExecuting(request)) {
				return cache.onExecute(request);
			}
		}

		Optional<T> result = cache.check(request);

		if (result.isPresent()) {
			request.getOnCompletion().accept(result.get());
			return new Future().unlock();
		} else {
			return dispatcher.execute(request, true);
		}
	}

	public void close() {
		dispatcher.close();
	}
}
