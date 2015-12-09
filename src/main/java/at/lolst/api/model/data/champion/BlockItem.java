package at.lolst.api.model.data.champion;

public final class BlockItem {
	private final int count, id;

	public BlockItem(int id, int count) {
		this.id = id;
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public int getId() {
		return id;
	}
}
