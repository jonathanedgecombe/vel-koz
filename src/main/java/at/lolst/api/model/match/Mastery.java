package at.lolst.api.model.match;

/**
 * 
 * @author jonathan
 *
 */
public final class Mastery {
	private final int masteryId, rank;

	public Mastery(int masteryId, int rank) {
		this.masteryId = masteryId;
		this.rank = rank;
	}

	public int getMasteryId() {
		return masteryId;
	}

	public int getRank() {
		return rank;
	}
}
