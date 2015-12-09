package at.lolst.api.model.match;

public final class BannedChampion {
	private final int championId, pickTurn;

	public BannedChampion(int championId, int pickTurn) {
		this.championId = championId;
		this.pickTurn = pickTurn;
		
	}

	public int getChampionId() {
		return championId;
	}

	public int getPickTurn() {
		return pickTurn;
	}
}
