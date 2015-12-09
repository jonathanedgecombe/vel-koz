package at.lolst.api.model.data.item;

public final class Group {
	private final String key, MaxGroupOwnable;

	public Group(String key, String MaxGroupOwnable) {
		this.key = key;
		this.MaxGroupOwnable = MaxGroupOwnable;
	}

	public String getKey() {
		return key;
	}

	public String getMaxGroupOwnable() {
		return MaxGroupOwnable;
	}
}
