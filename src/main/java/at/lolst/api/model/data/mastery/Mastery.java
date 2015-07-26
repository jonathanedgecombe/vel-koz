package at.lolst.api.model.data.mastery;

import java.util.List;

import at.lolst.api.model.data.Image;

/**
 * 
 * @author jonathan
 *
 */
public final class Mastery {
	private final List<String> description;
	private final int id, ranks;
	private final Image image;
	private final String name, prereq;

	public Mastery(List<String> description, int id, int ranks, Image image, String name, String prereq) {
		this.description = description;
		this.id = id;
		this.ranks = ranks;
		this.image = image;
		this.name = name;
		this.prereq = prereq;
	}

	public List<String> getDescription() {
		return description;
	}

	public int getId() {
		return id;
	}

	public int getRanks() {
		return ranks;
	}

	public Image getImage() {
		return image;
	}

	public String getName() {
		return name;
	}

	public String getPrereq() {
		return prereq;
	}
}
