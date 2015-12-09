package at.lolst.api.model.league;

import java.util.List;

public final class League {
	private final String name, participantId, queue, tier;
	private final List<LeagueEntry> entries;

	public League(String name, String participantId, String queue, String tier, List<LeagueEntry> entries) {
		this.name = name;
		this.participantId = participantId;
		this.queue = queue;
		this.tier = tier;
		this.entries = entries;
	}

	public String getName() {
		return name;
	}

	public String getParticipantId() {
		return participantId;
	}

	public String getQueue() {
		return queue;
	}

	public String getTier() {
		return tier;
	}

	public List<LeagueEntry> getEntries() {
		return entries;
	}
}
