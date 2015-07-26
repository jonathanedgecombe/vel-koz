package at.lolst.api.model.match;

/**
 * 
 * @author jonathan
 *
 */
public final class Position {
	private final int x, y;

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
