package at.lolst.api.model.game;

import java.util.List;

public final class RecentGames {
	private final List<Game> games;
	private final long summonerId;

	public RecentGames(List<Game> games, long summonerId) {
		this.games = games;
		this.summonerId = summonerId;
	}

	public List<Game> getGames() {
		return games;
	}

	public long getSummonerId() {
		return summonerId;
	}
}
