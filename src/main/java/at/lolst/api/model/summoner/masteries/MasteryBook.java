package at.lolst.api.model.summoner.masteries;

import java.util.List;

public final class MasteryBook {
	private final List<MasteryPage> pages;
	private final long summonerId;

	public MasteryBook(List<MasteryPage> pages, long summonerId) {
		this.pages = pages;
		this.summonerId = summonerId;
	}

	public List<MasteryPage> getPages() {
		return pages;
	}

	public long getSummonerId() {
		return summonerId;
	}
}
