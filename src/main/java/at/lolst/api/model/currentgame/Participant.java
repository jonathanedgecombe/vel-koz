package at.lolst.api.model.currentgame;

import java.util.List;

import at.lolst.api.model.data.rune.Rune;
import at.lolst.api.model.match.Mastery;

public final class Participant {
	private final boolean bot;
	private final long championId, profileIconId, spell1Id, spell2Id, summonerId, teamId;
	private final List<Mastery> masteries;
	private final List<Rune> runes;
	private final String summonerName;

	public Participant(boolean bot, long championId, List<Mastery> masteries, long profileIconId, List<Rune> runes, long spell1Id, long spell2Id, long summonerId, String summonerName, long teamId) {
		this.bot = bot;
		this.championId = championId;
		this.profileIconId = profileIconId;
		this.spell1Id = spell1Id;
		this.spell2Id = spell2Id;
		this.summonerId = summonerId;
		this.teamId = teamId;
		this.masteries = masteries;
		this.runes = runes;
		this.summonerName = summonerName;
	}

	public boolean isBot() {
		return bot;
	}

	public long getChampionId() {
		return championId;
	}

	public long getProfileIconId() {
		return profileIconId;
	}

	public long getSpell1Id() {
		return spell1Id;
	}

	public long getSpell2Id() {
		return spell2Id;
	}

	public long getSummonerId() {
		return summonerId;
	}

	public long getTeamId() {
		return teamId;
	}

	public List<Mastery> getMasteries() {
		return masteries;
	}

	public List<Rune> getRunes() {
		return runes;
	}

	public String getSummonerName() {
		return summonerName;
	}
}
