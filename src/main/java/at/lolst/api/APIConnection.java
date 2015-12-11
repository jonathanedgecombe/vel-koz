package at.lolst.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import at.lolst.api.request.Cache;
import at.lolst.api.request.RequestDispatcher;
import at.lolst.api.request.Result;
import at.lolst.api.request.Request;

public final class APIConnection {
	private final List<RateLimit> rateLimits = new ArrayList<>();
	private final Cache cache;
	private final RequestDispatcher dispatcher;

	public APIConnection(String key, Config config, RateLimit... rateLimits) {
		this.cache = new Cache(config);
		this.dispatcher = new RequestDispatcher(this, cache, key);

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

	public boolean waitForRateLimits(boolean wait) throws InterruptedException {
		for (RateLimit limit : rateLimits) {
			if (!limit.acquire(wait)) return false;
		}

		return true;
	}

	public <T> Future<T> execute(Request<T> request, boolean wait) throws InterruptedException {
		Optional<Result<T>> result = cache.check(request);

		if (result.isPresent()) {
			request.accept(result.get());
			return new Future<T>().unlock(result.get());
		} else {
			return dispatcher.execute(request, true, wait);
		}
	}

	public <T> Future<T> execute(Request<T> request) throws InterruptedException {
		return execute(request, true);
	}

	@SafeVarargs
	public final <T> FutureList<T> execute(Request<T>... requests) throws InterruptedException {
		FutureList<T> list = new FutureList<>();

		for (Request<T> request : requests) {
			list.add(execute(request));
		}

		return list;
	}

	public void close() {
		dispatcher.close();
	}
}
