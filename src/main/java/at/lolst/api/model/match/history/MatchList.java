package at.lolst.api.model.match.history;

import java.util.List;

import at.lolst.api.model.match.MatchReference;

public final class MatchList {
	private final int startIndex, endIndex, totalGames;
	private final List<MatchReference> matches;

	public MatchList(int startIndex, int endIndex, int totalGames, List<MatchReference> matches) {
		this.startIndex = startIndex;
		this.endIndex = endIndex;
		this.totalGames = totalGames;
		this.matches = matches;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public int getEndIndex() {
		return endIndex;
	}

	public int getTotalGames() {
		return totalGames;
	}

	public List<MatchReference> getMatches() {
		return matches;
	}
}
