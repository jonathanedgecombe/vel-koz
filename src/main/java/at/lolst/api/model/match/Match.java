package at.lolst.api.model.match;

import java.util.List;

public final class Match {
	private final int mapId;
	private final long matchCreation, matchDuration, matchId;
	private final String matchMode, matchType, matchVersion, platformId, queueType, region, season;
	private final List<Participant> participants;
	private final List<ParticipantIdentity> participantIdentities;
	private final List<Team> teams;
	private final Timeline timeline;

	public Match(int mapId, long matchCreation, long matchDuration, long matchId, String matchMode, String matchType, String matchVersion, List<Participant> participants, List<ParticipantIdentity> participantIdentities, String platformId, String queueType, String region, String season, List<Team> teams, Timeline timeline) {
		this.mapId = mapId;
		this.matchCreation = matchCreation;
		this.matchDuration = matchDuration;
		this.matchId = matchId;
		this.matchMode = matchMode;
		this.matchType = matchType;
		this.matchVersion = matchVersion;
		this.participantIdentities = participantIdentities;
		this.participants = participants;
		this.platformId = platformId;
		this.queueType = queueType;
		this.region = region;
		this.season = season;
		this.teams = teams;
		this.timeline = timeline;
	}

	public int getMapId() {
		return mapId;
	}

	public long getMatchCreation() {
		return matchCreation;
	}

	public long getMatchDuration() {
		return matchDuration;
	}

	public long getMatchId() {
		return matchId;
	}

	public String getMatchMode() {
		return matchMode;
	}

	public String getMatchType() {
		return matchType;
	}

	public String getMatchVersion() {
		return matchVersion;
	}

	public String getPlatformId() {
		return platformId;
	}

	public String getQueueType() {
		return queueType;
	}

	public String getRegion() {
		return region;
	}

	public String getSeason() {
		return season;
	}

	public List<Participant> getParticipants() {
		return participants;
	}

	public List<ParticipantIdentity> getParticipantIdentities() {
		return participantIdentities;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public Timeline getTimeline() {
		return timeline;
	}
}
