package at.lolst.api.model.data.rune;

public final class MetaData {
	private final boolean isRune;
	private final String tier, type;

	public MetaData(boolean isRune, String tier, String type) {
		this.isRune = isRune;
		this.tier = tier;
		this.type = type;
	}

	public boolean isRune() {
		return isRune;
	}

	public String getTier() {
		return tier;
	}

	public String getType() {
		return type;
	}
}
