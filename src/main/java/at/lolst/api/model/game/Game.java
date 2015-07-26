package at.lolst.api.model.game;

import java.util.List;

/**
 * 
 * @author jonathan
 *
 */
public final class Game {
	private final int championId, ipEarned, level, mapId, spell1, spell2, teamId;
	private final long createDate, gameId;
	private final List<Player> fellowPlayers;
	private final String gameMode, gameType, subType;
	private final boolean invalid;
	private final RawStats stats;

	public Game(int championId, int ipEarned, int level, int mapId, int spell1, int spell2, int teamId, long createDate, long gameId, List<Player> fellowPlayers, String gameMode, String gameType, String subType, boolean invalid, RawStats stats) {
		this.championId = championId;
		this.ipEarned = ipEarned;
		this.level = level;
		this.mapId = mapId;
		this.spell1 = spell1;
		this.spell2 = spell2;
		this.teamId = teamId;
		this.createDate = createDate;
		this.gameId = gameId;
		this.fellowPlayers = fellowPlayers;
		this.gameMode = gameMode;
		this.gameType = gameType;
		this.subType = subType;
		this.invalid = invalid;
		this.stats = stats;
	}

	public int getChampionId() {
		return championId;
	}

	public int getIpEarned() {
		return ipEarned;
	}

	public int getLevel() {
		return level;
	}

	public int getMapId() {
		return mapId;
	}

	public int getSpell1() {
		return spell1;
	}

	public int getSpell2() {
		return spell2;
	}

	public int getTeamId() {
		return teamId;
	}

	public long getCreateDate() {
		return createDate;
	}

	public long getGameId() {
		return gameId;
	}

	public List<Player> getFellowPlayers() {
		return fellowPlayers;
	}

	public String getGameMode() {
		return gameMode;
	}

	public String getGameType() {
		return gameType;
	}

	public String getSubType() {
		return subType;
	}

	public boolean isInvalid() {
		return invalid;
	}

	public RawStats getStats() {
		return stats;
	}
}
