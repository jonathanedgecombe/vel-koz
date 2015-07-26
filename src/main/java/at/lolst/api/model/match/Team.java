package at.lolst.api.model.match;

import java.util.List;

/**
 * 
 * @author jonathan
 *
 */
public final class Team {
	private final List<BannedChampion> bans;
	private final int baronKills, dragonKills, inhibitorKills, teamId, towerKills, vilemawKills;
	private final long dominionVictoryScore;
	private final boolean firstBaron, firstBlood, firstDragon, firstInhibitor, firstTower, winner;

	public Team(List<BannedChampion> bans, int baronKills, long dominionVictoryScore, int dragonKills, boolean firstBaron, boolean firstBlood, boolean firstDragon, boolean firstInhibitor, boolean firstTower, int inhibitorKills, int teamId, int towerKills, int vilemawKills, boolean winner) {
		this.bans = bans;
		this.baronKills = baronKills;
		this.dominionVictoryScore = dominionVictoryScore;
		this.dragonKills = dragonKills;
		this.firstBaron = firstBaron;
		this.firstBlood = firstBlood;
		this.firstDragon = firstDragon;
		this.firstInhibitor = firstInhibitor;
		this.firstTower = firstTower;
		this.inhibitorKills = inhibitorKills;
		this.teamId = teamId;
		this.towerKills = towerKills;
		this.vilemawKills = vilemawKills;
		this.winner = winner;
	}

	public List<BannedChampion> getBans() {
		return bans;
	}

	public int getBaronKills() {
		return baronKills;
	}

	public int getDragonKills() {
		return dragonKills;
	}

	public int getInhibitorKills() {
		return inhibitorKills;
	}

	public int getTeamId() {
		return teamId;
	}

	public int getTowerKills() {
		return towerKills;
	}

	public int getVilemawKills() {
		return vilemawKills;
	}

	public long getDominionVictoryScore() {
		return dominionVictoryScore;
	}

	public boolean isFirstBaron() {
		return firstBaron;
	}

	public boolean isFirstBlood() {
		return firstBlood;
	}

	public boolean isFirstDragon() {
		return firstDragon;
	}

	public boolean isFirstInhibitor() {
		return firstInhibitor;
	}

	public boolean isFirstTower() {
		return firstTower;
	}

	public boolean isWinner() {
		return winner;
	}
}
