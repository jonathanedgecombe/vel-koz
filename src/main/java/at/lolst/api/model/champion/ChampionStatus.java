package at.lolst.api.model.champion;

/**
 * 
 * @author jonathan
 *
 */
public final class ChampionStatus {
	private final boolean active, botEnabled, botMmEnabled, freeToPlay, rankedPlayEnabled;
	private final long id;

	public ChampionStatus(boolean active, boolean botEnabled, boolean botMmEnabled, boolean freeToPlay, boolean rankedPlayEnabled, long id) {
		this.active = active;
		this.botEnabled = botEnabled;
		this.botMmEnabled = botMmEnabled;
		this.freeToPlay = freeToPlay;
		this.rankedPlayEnabled = rankedPlayEnabled;
		this.id = id;
	}

	public boolean isActive() {
		return active;
	}

	public boolean isBotEnabled() {
		return botEnabled;
	}

	public boolean isBotMmEnabled() {
		return botMmEnabled;
	}

	public boolean isFreeToPlay() {
		return freeToPlay;
	}

	public boolean isRankedPlayEnabled() {
		return rankedPlayEnabled;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "champion#" + id;
	}
}
