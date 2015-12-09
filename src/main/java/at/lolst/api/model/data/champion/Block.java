package at.lolst.api.model.data.champion;

import java.util.List;

public final class Block {
	private final List<BlockItem> items;
	private final boolean recMath;
	private final String type;

	public Block(List<BlockItem> items, boolean recMath, String type) {
		this.items = items;
		this.recMath = recMath;
		this.type = type;
	}

	public List<BlockItem> getItems() {
		return items;
	}

	public boolean isRecMath() {
		return recMath;
	}

	public String getType() {
		return type;
	}
}
