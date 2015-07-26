package at.lolst.api.model.match;

/**
 * 
 * @author jonathan
 *
 */
public final class Rune {
	private final int runeId, rank;

	public Rune(int runeId, int rank) {
		this.runeId = runeId;
		this.rank = rank;
	}

	public int getRuneId() {
		return runeId;
	}

	public int getRank() {
		return rank;
	}
}
