package at.lolst.api.model.match;

import java.util.List;

/**
 * 
 * @author jonathan
 *
 */
public final class Participant {
	private final int championId, participantId, spell1Id, spell2Id, teamId;
	private final List<Mastery> masteries;
	private final List<Rune> runes;
	private final ParticipantStats stats;
	private final ParticipantTimeline timeline;

	public Participant(int championId, List<Mastery> masteries, int participantId, List<Rune> runes, int spell1Id, int spell2Id, int teamId, ParticipantStats stats, ParticipantTimeline timeline) {
		this.championId = championId;
		this.participantId = participantId;
		this.spell1Id = spell1Id;
		this.spell2Id = spell2Id;
		this.teamId = teamId;
		this.masteries = masteries;
		this.runes = runes;
		this.stats = stats;
		this.timeline = timeline;
	}

	public int getChampionId() {
		return championId;
	}

	public int getParticipantId() {
		return participantId;
	}

	public int getSpell1Id() {
		return spell1Id;
	}

	public int getSpell2Id() {
		return spell2Id;
	}

	public int getTeamId() {
		return teamId;
	}

	public List<Mastery> getMasteries() {
		return masteries;
	}

	public List<Rune> getRunes() {
		return runes;
	}

	public ParticipantTimeline getTimeline() {
		return timeline;
	}

	public ParticipantStats getStats() {
		return stats;
	}
}
