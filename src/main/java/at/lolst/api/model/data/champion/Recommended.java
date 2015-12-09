package at.lolst.api.model.data.champion;

public final class Recommended {
	private final String champion, map, mode, title, type;
	private boolean priority;

	public Recommended(String champion, String map, String mode, String title, String type, boolean priority) {
		this.champion = champion;
		this.map = map;
		this.mode = mode;
		this.title = title;
		this.type = type;
	}

	public String getChampion() {
		return champion;
	}

	public String getMap() {
		return map;
	}

	public String getMode() {
		return mode;
	}

	public String getTitle() {
		return title;
	}

	public String getType() {
		return type;
	}

	public boolean isPriority() {
		return priority;
	}

	public void setPriority(boolean priority) {
		this.priority = priority;
	}
}
