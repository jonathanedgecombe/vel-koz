package at.lolst.api.model.summoner;

/**
 * 
 * @author jonathan
 *
 */
public final class Summoner {
	private final long id;
	private final String name;
	private final int profileIconId;
	private final long revisionDate;
	private final int summonerLevel;

	public Summoner(long id, String name, int profileIconId, long revisionDate, int summonerLevel) {
		this.id = id;
		this.name = name;
		this.profileIconId = profileIconId;
		this.revisionDate = revisionDate;
		this.summonerLevel = summonerLevel;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getProfileIconId() {
		return profileIconId;
	}

	public long getRevisionDate() {
		return revisionDate;
	}

	public int getSummonerLevel() {
		return summonerLevel;
	}
}
