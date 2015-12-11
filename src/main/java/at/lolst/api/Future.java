package at.lolst.api;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.Semaphore;

import at.lolst.api.request.Request;
import at.lolst.api.request.RequestException;
import at.lolst.api.request.Result;

public class Future<T> {
	protected final Semaphore semaphore = new Semaphore(1);

	protected Optional<Result<T>> result = Optional.empty();
	protected Map<Request<T>, RequestException> exceptions = new HashMap<>();

	public Future() throws InterruptedException {
		semaphore.acquire();
	}

	public void await() throws InterruptedException {
		semaphore.acquire();
		semaphore.release();
	}

	public Future<T> unlock(Result<T> result) throws InterruptedException {
		this.result = Optional.of(result);
		return unlock();
	}

	public Future<T> unlock(Request<T> request, RequestException ex) throws InterruptedException {
		this.exceptions.put(request, ex);
		return unlock();
	}

	public Future<T> unlock() throws InterruptedException {
		semaphore.release();
		return this;
	}

	public Optional<Result<T>> getResult() {
		return result;
	}

	public Map<Request<T>, RequestException> getExceptions() {
		return exceptions;
	}

	public Optional<RequestException> getException() {
		if (exceptions.isEmpty()) return Optional.empty();
		return Optional.of(exceptions.values().iterator().next());
	}

	public T get() {
		Optional<Result<T>> result = getResult();
		if (result.isPresent())
			return result.get().get();

		return null;
	}
}
