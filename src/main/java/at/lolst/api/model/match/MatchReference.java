package at.lolst.api.model.match;

public final class MatchReference {
	private final int champion;
	private final long matchId, timestamp;
	private final String lane, platformId, queue, role, season;

	public MatchReference(int champion, long matchId, long timestamp, String lane, String platformId, String queue, String role, String season) {
		this.champion = champion;
		this.matchId = matchId;
		this.timestamp = timestamp;
		this.lane = lane;
		this.platformId = platformId;
		this.queue = queue;
		this.role = role;
		this.season = season;
	}

	public int getChampion() {
		return champion;
	}

	public long getMatchId() {
		return matchId;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public String getLane() {
		return lane;
	}

	public String getPlatformId() {
		return platformId;
	}

	public String getQueue() {
		return queue;
	}

	public String getRole() {
		return role;
	}

	public String getSeason() {
		return season;
	}
}
