package at.lolst.api;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import at.lolst.api.request.Request;
import at.lolst.api.request.summoner.SummonerRequest;

/**
 * 
 * @author jonathan
 *
 */
public final class Config {
	private final int cacheSize;

	private final Map<Class<? extends Request<?>>, Integer> cacheTimeouts = new HashMap<>();

	public Config(int cacheSize) {
		this.cacheSize = cacheSize;

		this.cacheTimeouts.put(SummonerRequest.class, 60 * 60);
	}

	public int getCacheSize() {
		return cacheSize;
	}

	public <T> Optional<Integer> getTimeout(Request<T> request) {
		return Optional.ofNullable(cacheTimeouts.get(request.getClass()));
	}

	/**
	 * Set a timeout for the given class of request.
	 * 
	 * @param requestClass
	 * @param timeout given in seconds.
	 * @return
	 */
	public Config setTimeout(Class<? extends Request<?>> requestClass, int timeout) {
		cacheTimeouts.put(requestClass, timeout);
		return this;
	}
}
