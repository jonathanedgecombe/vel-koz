package at.lolst.api.model.match.history;

import java.util.List;

import at.lolst.api.model.match.Match;

/**
 * 
 * @author jonathan
 *
 */
public final class MatchHistory {
	private final List<Match> matches;

	public MatchHistory(List<Match> matches) {
		this.matches = matches;
	}

	public List<Match> getMatches() {
		return matches;
	}
}
