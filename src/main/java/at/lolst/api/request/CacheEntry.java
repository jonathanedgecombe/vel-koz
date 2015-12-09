package at.lolst.api.request;

public final class CacheEntry<T> {
	private final Result<T> result;
	private final long timeout;

	public CacheEntry(Result<T> result, long timeout) {
		this.result = result;
		this.timeout = timeout;
	}

	public Result<T> getResult() {
		return result;
	}

	public boolean expired() {
		return System.currentTimeMillis() > timeout;
	}
}
