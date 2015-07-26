package at.lolst.api.request;

/**
 * 
 * @author jonathan
 *
 * @param <T>
 */
public final class CacheEntry<T> {
	private final T value;
	private final long time;

	public CacheEntry(T value) {
		this.value = value;
		this.time = System.currentTimeMillis();
	}

	public T getResult() {
		return value;
	}

	public long getTime() {
		return time;
	}
}
