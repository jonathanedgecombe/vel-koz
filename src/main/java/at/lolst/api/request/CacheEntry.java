package at.lolst.api.request;

/**
 * 
 * @author jonathan
 *
 * @param <T>
 */
public final class CacheEntry<T> {
	private final Result<T> result;
	private final long time;

	public CacheEntry(Result<T> result) {
		this.result = result;
		this.time = System.currentTimeMillis();
	}

	public Result<T> getResult() {
		return result;
	}

	public long getTime() {
		return time;
	}
}
