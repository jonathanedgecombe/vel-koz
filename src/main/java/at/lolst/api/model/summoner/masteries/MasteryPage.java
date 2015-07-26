package at.lolst.api.model.summoner.masteries;

import java.util.List;

/**
 * 
 * @author jonathan
 *
 */
public final class MasteryPage {
	private final List<Mastery> masteries;
	private final long id;
	private final String name;
	private final boolean current;

	public MasteryPage(List<Mastery> masteries, long id, String name, boolean current) {
		this.masteries = masteries;
		this.id = id;
		this.name = name;
		this.current = current;
	}

	public List<Mastery> getMasteries() {
		return masteries;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public boolean isCurrent() {
		return current;
	}
}
