package at.lolst.api.model.match;

public final class Player {
	private final String matchHistoryUri, summonerName;
	private final int profileIcon;
	private final long summonerId;

	public Player(String matchHistoryUri, String summonerName, int profileIcon, long summonerId) {
		this.matchHistoryUri = matchHistoryUri;
		this.profileIcon = profileIcon;
		this.summonerId = summonerId;
		this.summonerName = summonerName;
	}

	public String getMatchHistoryUri() {
		return matchHistoryUri;
	}

	public String getSummonerName() {
		return summonerName;
	}

	public int getProfileIcon() {
		return profileIcon;
	}

	public long getSummonerId() {
		return summonerId;
	}
}
