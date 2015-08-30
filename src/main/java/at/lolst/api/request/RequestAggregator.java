package at.lolst.api.request;

import at.lolst.api.Future;

/**
 * 
 * @author jonathan
 *
 * @param <T>
 */
public abstract class RequestAggregator<T> {
	public abstract Future aggregate(Request<T> request, RequestDispatcher dispatcher, boolean wait) throws InterruptedException;
	public abstract void cache(Request<T> request, Result<T> result, Cache cache);
}
