package at.lolst.api.model.currentgame;

import java.util.List;

/**
 * 
 * @author jonathan
 *
 */
public final class CurrentGameInfo {
	private final List<BannedChampion> bannedChampions;
	private final long gameId, gameLength, gameQueueConfigId, gameStartTime, mapId;
	private final String gameMode, gameType, platformId;
	private final Observer observers;
	private final List<Participant> participants;

	public CurrentGameInfo(List<BannedChampion> bannedChampions, long gameId, long gameLength, String gameMode, long gameQueueConfigId, long gameStartTime, String gameType, long mapId, Observer observers, List<Participant> participants, String platformId) {
		this.bannedChampions = bannedChampions;
		this.gameId = gameId;
		this.gameLength = gameLength;
		this.gameMode = gameMode;
		this.gameQueueConfigId = gameQueueConfigId;
		this.gameStartTime = gameStartTime;
		this.gameType = gameType;
		this.mapId = mapId;
		this.observers = observers;
		this.participants = participants;
		this.platformId = platformId;
	}

	public List<BannedChampion> getBannedChampions() {
		return bannedChampions;
	}

	public long getGameId() {
		return gameId;
	}

	public long getGameLength() {
		return gameLength;
	}

	public long getGameQueueConfigId() {
		return gameQueueConfigId;
	}

	public long getGameStartTime() {
		return gameStartTime;
	}

	public long getMapId() {
		return mapId;
	}

	public String getGameMode() {
		return gameMode;
	}

	public String getGameType() {
		return gameType;
	}

	public String getPlatformId() {
		return platformId;
	}

	public Observer getObservers() {
		return observers;
	}

	public List<Participant> getParticipants() {
		return participants;
	}
}
