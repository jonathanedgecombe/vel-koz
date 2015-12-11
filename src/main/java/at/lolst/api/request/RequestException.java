package at.lolst.api.request;

public final class RequestException extends Exception {
	private static final long serialVersionUID = -8978885202197593153L;

	public final static int CONNECTION_EXCEPTION = 600;
	public final static int DESERIALIZE_EXCEPTION = 601;

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
