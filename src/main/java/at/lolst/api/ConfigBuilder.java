package at.lolst.api;

public final class ConfigBuilder {
	private int cacheSize = 1024;

	public ConfigBuilder setCacheSize(int cacheSize) {
		this.cacheSize = cacheSize;
		return this;
	}

	public Config build() {
		return new Config(cacheSize);
	}
}
