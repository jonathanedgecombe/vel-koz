package at.lolst.api.model.currentgame;

/**
 * 
 * @author jonathan
 *
 */
public final class BannedChampion {
	private final long championId, teamId;
	private final int pickTurn;

	public BannedChampion(long chmpionId, int pickTurn, long teamId) {
		this.championId = chmpionId;
		this.pickTurn = pickTurn;
		this.teamId = teamId;
	}

	public long getChampionId() {
		return championId;
	}

	public long getTeamId() {
		return teamId;
	}

	public int getPickTurn() {
		return pickTurn;
	}
}
