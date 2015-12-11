package at.lolst.api.request;

import java.util.Optional;

import at.lolst.api.APIConnection;
import at.lolst.api.Future;

import com.ning.http.client.AsyncCompletionHandler;
import com.ning.http.client.AsyncHttpClient;
import com.ning.http.client.AsyncHttpClientConfig;
import com.ning.http.client.Response;

public final class RequestDispatcher {
	private final APIConnection connection;
	private final Cache cache;

	private final String key;
	private final AsyncHttpClient client;

	public RequestDispatcher(APIConnection connection, Cache cache, String key) {
		this.connection = connection;
		this.cache = cache;
		this.key = key;
		this.client = new AsyncHttpClient(new AsyncHttpClientConfig.Builder().setAllowPoolingConnections(true).setAllowPoolingSslConnections(true).build());
	}

	public <T> Future<T> execute(final Request<T> request, boolean aggregate, boolean wait) throws InterruptedException {
		if (aggregate) {
			Optional<RequestAggregator<T>> aggreagtor = request.getAggregator();
	
			if (aggreagtor.isPresent()) {
				return aggreagtor.get().aggregate(request, this, wait);
			}
		}

		String url = "https://" + request.getRegion().getUrl() + request.getUrl();

		if (url.contains("?")) {
			url += "&api_key=" + key;
		} else {
			url += "?api_key=" + key;
		}

		final Future<T> future = new Future<>();
		if (!connection.waitForRateLimits(wait)) {
			RequestException ex = new RequestException(429);
			request.accept(ex);
			return future.unlock(request, ex);
		}

		client.prepareGet(url).execute(new AsyncCompletionHandler<Response>() {
			@Override
			public Response onCompleted(Response response) throws InterruptedException {
				if (response.getStatusCode() == 200) {
					try {
						String body = response.getResponseBody();
						
						T value = request.deserialize(body);
						Result<T> result = new Result<>(body, value, request, cache);
						request.accept(result);

						future.unlock(result);
					} catch (Exception ex) {
						RequestException re = new RequestException(RequestException.DESERIALIZE_EXCEPTION);
						request.accept(re);
						future.unlock(request, re);
					}
				} else {
					RequestException ex = new RequestException(response.getStatusCode());
					request.accept(ex);

					future.unlock(request, ex);
				}

				return response;
			}

			@Override
			public void onThrowable(Throwable error) {
				RequestException re = new RequestException(RequestException.CONNECTION_EXCEPTION);
				request.accept(re);

				try {
					future.unlock(request, re);
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
