package at.lolst.api.model.data.champion;

/**
 * 
 * @author jonathan
 *
 */
public final class Skin {
	private final int id, num;
	private final String name;

	public Skin(int id, int num, String name) {
		this.id = id;
		this.num = num;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}
}
