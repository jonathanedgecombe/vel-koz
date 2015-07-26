package at.lolst.api.model.game;

/**
 * 
 * @author jonathan
 *
 */
public final class Player {
	private final int championId, teamId;
	private final long summonerId;

	public Player(int championId, long summonerId, int teamId) {
		this.championId = championId;
		this.summonerId = summonerId;
		this.teamId = teamId;
	}

	public int getChampionId() {
		return championId;
	}

	public int getTeamId() {
		return teamId;
	}

	public long getSummonerId() {
		return summonerId;
	}
}
