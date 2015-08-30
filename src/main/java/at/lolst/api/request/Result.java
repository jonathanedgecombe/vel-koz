package at.lolst.api.request;

public final class Result<T> {
	private final String json;
	private final T value;

	public Result(String json, T value) {
		this.json = json;
		this.value = value;
	}

	public String getJson() {
		return json;
	}

	public T getValue() {
		return value;
	}
}
