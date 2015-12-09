package at.lolst.api.request;

import at.lolst.api.Future;

public abstract class RequestAggregator<T> {
	public abstract Future<T> aggregate(Request<T> request, RequestDispatcher dispatcher, boolean wait) throws InterruptedException;
	public abstract void cache(Request<T> request, Result<T> result, Cache cache, long timeout);
}
