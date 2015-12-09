package at.lolst.api.model.summoner.runes;

public final class Rune {
	private final int runeId;
	private final int runeSlotId;

	public Rune(int runeId, int runeSlotId) {
		this.runeId = runeId;
		this.runeSlotId = runeSlotId;
	}

	public int getRuneId() {
		return runeId;
	}

	public int getRuneSlotId() {
		return runeSlotId;
	}
}
