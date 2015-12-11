package at.lolst.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import at.lolst.api.request.Request;
import at.lolst.api.request.RequestException;
import at.lolst.api.request.Result;

public final class FutureList<T> extends Future<T> {
	private final List<Future<T>> futures = new ArrayList<>();

	public FutureList() throws InterruptedException {
		super();
	}

	public void add(Future<T> future) {
		futures.add(future);
	}

	@Override
	public void await() throws InterruptedException {
		for (Future<T> future : futures) {
			future.await();
		}
	}

	@Override
	public Optional<Result<T>> getResult() {
		throw new AssertionError("Not implemented");
	}

	@Override
	public Map<Request<T>, RequestException> getExceptions() {
		throw new AssertionError("Not implemented");
	}

	@Override
	public Optional<RequestException> getException() {
		throw new AssertionError("Not implemented");
	}
}
