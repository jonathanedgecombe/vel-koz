package at.lolst.api.model.summoner.masteries;

public final class Mastery {
	private final int id;
	private final int rank;
 
	public Mastery(int id, int rank) {
		this.id = id;
		this.rank = rank;
	}

	public int getId() {
		return id;
	}

	public int getRank() {
		return rank;
	}
}
