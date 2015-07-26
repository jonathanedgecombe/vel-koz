package at.lolst.api.request;

/**
 * 
 * @author jonathan
 *
 */
public final class RequestException extends Exception {
	private static final long serialVersionUID = -8978885202197593153L;

	private final int code;

	public RequestException(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + "(" + code + ")";
	}
}
