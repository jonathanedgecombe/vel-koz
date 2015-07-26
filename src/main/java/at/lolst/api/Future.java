package at.lolst.api;

import java.util.concurrent.Semaphore;

/**
 * 
 * @author jonathan
 *
 */
public class Future {
	protected final Semaphore semaphore = new Semaphore(1);

	public Future() throws InterruptedException {
		semaphore.acquire();
	}

	/**
	 * Wait for the events of this future to complete.
	 * @throws InterruptedException
	 */
	public void await() throws InterruptedException {
		semaphore.acquire();
		semaphore.release();
	}

	public Future unlock() throws InterruptedException {
		semaphore.release();
		return this;
	}
}
