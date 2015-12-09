package at.lolst.api.model.league;

import java.util.ArrayList;
import java.util.List;

public final class MiniSeries {
	public enum GameResult {
		WIN,
		LOSS,
		NOT_PLAYED;
	}

	private final int wins, losses, target;
	private final String progress;

	public MiniSeries(int wins, int losses, int target, String progress) {
		this.wins = wins;
		this.losses = losses;
		this.target = target;
		this.progress = progress;
	}

	public int getWins() {
		return wins;
	}

	public int getLosses() {
		return losses;
	}

	public int getTarget() {
		return target;
	}

	public List<GameResult> getProgress() {
		List<GameResult> progress = new ArrayList<>();

		for (String c : this.progress.split("")) {
			if (c.equals("W")) {
				progress.add(GameResult.WIN);
			} else if (c.equals("L")) {
				progress.add(GameResult.LOSS);
			} else if (c.equals("N")) {
				progress.add(GameResult.NOT_PLAYED);
			} else {
				throw new AssertionError("Invalid progression " + c + " in MiniSeries.");
			}
		}

		return progress;
	}
}
