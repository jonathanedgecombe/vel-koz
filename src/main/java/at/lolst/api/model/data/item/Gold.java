package at.lolst.api.model.data.item;

public final class Gold {
	private final int base, sell, total;
	private final boolean purchasable;

	public Gold(int base, int sell, int total, boolean purchasable) {
		this.base = base;
		this.sell = sell;
		this.total = total;
		this.purchasable = purchasable;
	}

	public int getBase() {
		return base;
	}

	public int getSell() {
		return sell;
	}

	public int getTotal() {
		return total;
	}

	public boolean isPurchasable() {
		return purchasable;
	}
}
