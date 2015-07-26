package at.lolst.api.model.summoner.runes;

import java.util.List;

/**
 * 
 * @author jonathan
 *
 */
public final class RuneBook {
	private final List<RunePage> pages;
	private final long summonerId;

	public RuneBook(List<RunePage> pages, long summonerId) {
		this.pages = pages;
		this.summonerId = summonerId;
	}

	public List<RunePage> getPages() {
		return pages;
	}

	public long getSummonerId() {
		return summonerId;
	}
}
