package at.lolst.api.model.league;

public final class LeagueEntry {
	private final String division, playerOrTeamId, playerOrTeamName;
	private final boolean isFreshBlood, isHotStreak, isInactive, isVeteran;
	private final int leaguePoints, wins;
	private final MiniSeries miniSeries;

	public LeagueEntry(String division, String playerOrTeamId, String playerOrTeamName, boolean isFreshBlood, boolean isHotStreak, boolean isInactive, boolean isVeteran, int leaguePoints, int wins, MiniSeries miniSeries) {
		this.division = division;
		this.playerOrTeamId = playerOrTeamId;
		this.playerOrTeamName = playerOrTeamName;
		this.isFreshBlood = isFreshBlood;
		this.isHotStreak = isHotStreak;
		this.isInactive = isInactive;
		this.isVeteran = isVeteran;
		this.leaguePoints = leaguePoints;
		this.wins = wins;
		this.miniSeries = miniSeries;
	}

	public String getDivision() {
		return division;
	}

	public String getPlayerOrTeamId() {
		return playerOrTeamId;
	}

	public String getPlayerOrTeamName() {
		return playerOrTeamName;
	}

	public boolean isFreshBlood() {
		return isFreshBlood;
	}

	public boolean isHotStreak() {
		return isHotStreak;
	}

	public boolean isInactive() {
		return isInactive;
	}

	public boolean isVeteran() {
		return isVeteran;
	}

	public int getLeaguePoints() {
		return leaguePoints;
	}

	public int getWins() {
		return wins;
	}

	public MiniSeries getMiniSeries() {
		return miniSeries;
	}
}
