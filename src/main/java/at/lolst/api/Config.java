package at.lolst.api;

public final class Config {
	private final int cacheSize;

	public Config(int cacheSize) {
		this.cacheSize = cacheSize;
	}

	public int getCacheSize() {
		return cacheSize;
	}
}
