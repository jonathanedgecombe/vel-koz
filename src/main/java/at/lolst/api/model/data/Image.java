package at.lolst.api.model.data;

/**
 * 
 * @author jonathan
 *
 */
public final class Image {
	private final String full, group, sprite;
	private final int h, w, x, y;

	public Image(String full, String group, String sprite, int h, int w, int x, int y) {
		this.full = full;
		this.group = group;
		this.sprite = sprite;
		this.h = h;
		this.w = w;
		this.x = x;
		this.y = y;
	}

	public String getFull() {
		return full;
	}

	public String getGroup() {
		return group;
	}

	public String getSprite() {
		return sprite;
	}

	public int getH() {
		return h;
	}

	public int getW() {
		return w;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
