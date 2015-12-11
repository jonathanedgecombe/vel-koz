package at.lolst.api.request;

import java.util.concurrent.TimeUnit;

public final class Result<T> {
	private final String json;
	private final T value;
	private final Request<T> request;
	private final Cache cache;

	public Result(String json, T value, Request<T> request, Cache cache) {
		this.json = json;
		this.value = value;
		this.request = request;
		this.cache = cache;
	}

	public String getJson() {
		return json;
	}

	public T get() {
		return value;
	}

	public void cache(long duration, TimeUnit unit) {
		long timeout = System.currentTimeMillis() + unit.toMillis(duration);
		cache.cache(request, this, true, timeout);
	}
}
