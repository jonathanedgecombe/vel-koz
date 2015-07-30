package at.lolst.api.request;

import java.util.Optional;

import at.lolst.api.Future;

import com.ning.http.client.AsyncCompletionHandler;
import com.ning.http.client.AsyncHttpClient;
import com.ning.http.client.AsyncHttpClientConfig;
import com.ning.http.client.Response;

/**
 * 
 * @author jonathan
 *
 */
public final class RequestDispatcher {
	private final static int MAX_CONNECTIONS = 64;

	private final Cache cache;

	private final String key;
	private final AsyncHttpClient client;

	public RequestDispatcher(Cache cache, String key) {
		this.cache = cache;
		this.key = key;
		this.client = new AsyncHttpClient(new AsyncHttpClientConfig.Builder().setMaxConnectionsPerHost(MAX_CONNECTIONS).build());
	}

	public <T> Future execute(final Request<T> request, boolean aggregate) throws InterruptedException {
		if (aggregate) {
			Optional<RequestAggregator<T>> aggreagtor = request.getAggregator();
	
			if (aggreagtor.isPresent()) {
				return aggreagtor.get().aggregate(request, this);
			}
		}

		String url = "https://" + request.getRegion().getUrl() + request.getUrl();

		if (url.contains("?")) {
			url += "&api_key=" + key;
		} else {
			url += "?api_key=" + key;
		}

		final Future future = new Future();

		synchronized (cache.getExecuting()) {
			cache.startExecuting(request, future);
		}

		client.prepareGet(url).execute(new AsyncCompletionHandler<Response>() {
			@Override
			public Response onCompleted(Response response) throws InterruptedException {
				if (response.getStatusCode() == 200) {
					try {
						T result = request.deserialize(response.getResponseBody());
						cache.cache(request, result, true);
						request.getOnCompletion().accept(result);

						synchronized (cache.getExecuting()) {
							cache.finishExecuting(request, result);
						}
					} catch (Exception ex) {
						request.getOnError().accept(ex);

						synchronized (cache.getExecuting()) {
							cache.finishExecutingError(request, ex);
						}
					}
				} else {
					RequestException ex = new RequestException(response.getStatusCode());
					request.getOnError().accept(ex);

					synchronized (cache.getExecuting()) {
						cache.finishExecutingError(request, ex);
					}
				}

				future.unlock();
				return response;
			}

			@Override
			public void onThrowable(Throwable error) {
				request.getOnError().accept(error);

				synchronized (cache.getExecuting()) {
					cache.finishExecutingError(request, error);
				}

				try {
					future.unlock();
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
			}
		});

		return future;
	}

	public Cache getCache() {
		return cache;
	}

	public void close() {
		client.close();
	}
}
