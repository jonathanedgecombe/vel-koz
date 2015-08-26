package at.lolst.api;

import java.util.concurrent.Semaphore;

/**
 * 
 * @author Jonathan
 *
 */
public final class RateLimit implements Runnable {
	private final int number;
	private final int time;
	private final Semaphore semaphore;

	private long last = System.currentTimeMillis();

	/**
	 * Create a new rate limit.
	 * @param number Number of requests for time window.
	 * @param time Time window in milliseconds.
	 */
	public RateLimit(int number, int time) {
		this.number = number;
		this.time = time;
		this.semaphore = new Semaphore(number);

		new Thread(this).start();
	}

	public int getNumber() {
		return number;
	}

	public int getTime() {
		return time;
	}

	public boolean acquire(boolean wait) throws InterruptedException {
		if (wait) {
			semaphore.acquire();
			return true;
		}

		return semaphore.tryAcquire();
	}

	@Override
	public void run() {
		while (true) {
			try {
				long current = System.currentTimeMillis();
				long toSleep = Math.max(0, time - (current - last));
				last = current;
				Thread.sleep(toSleep);

				int diff = number - semaphore.availablePermits();
				semaphore.release(diff);
			} catch (InterruptedException e) {
				throw new AssertionError(e);
			}
		}
	}

	public int available() {
		return semaphore.availablePermits();
	}

	public float availability() {
		return ((float) semaphore.availablePermits()) / number;
	}

	public long time() {
		return Math.max(0, time - (System.currentTimeMillis() - last));
	}
}
