package at.lolst.api.model.summoner.runes;

import java.util.List;

public final class RunePage {
	private final long id;
	private final List<Rune> slots;
	private final String name;
	private final boolean current;

	public RunePage(long id, List<Rune> slots, String name, boolean current) {
		this.id = id;
		this.slots = slots;
		this.name = name;
		this.current = current;
	}

	public long getId() {
		return id;
	}

	public List<Rune> getSlots() {
		return slots;
	}

	public String getName() {
		return name;
	}

	public boolean isCurrent() {
		return current;
	}
}
