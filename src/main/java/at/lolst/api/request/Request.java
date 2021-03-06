package at.lolst.api.request;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Consumer;

import at.lolst.api.model.Region;
import com.google.gson.Gson;

public abstract class Request<T> {
	protected final Region region;
	protected final Consumer<Result<T>> onCompletion;
	protected final Consumer<RequestException> onError;

	public Request(Region region, Consumer<Result<T>> onCompletion, Consumer<RequestException> onError) {
		this.region = region;
		this.onCompletion = onCompletion;
		this.onError = onError;
	}

	public Region getRegion() {
		return region;
	}

	public abstract Type getType();

	public abstract String getUrl();

	public T deserialize(String body) {
		return new Gson().fromJson(body, getType());
	}

	public Consumer<Result<T>> getOnCompletion() {
		return onCompletion;
	}

	public void accept(Result<T> result) {
		if (onCompletion != null) onCompletion.accept(result);
	}

	public Consumer<RequestException> getOnError() {
		return onError;
	}

	public void accept(RequestException error) {
		if (onError != null) onError.accept(error);
	}

	public Optional<RequestAggregator<T>> getAggregator() {
		return Optional.empty();
	}

	public Collection<? extends Request<T>> explode() {
		throw new UnsupportedOperationException();
	}
}
