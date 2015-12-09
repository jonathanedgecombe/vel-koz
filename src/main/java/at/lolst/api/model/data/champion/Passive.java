package at.lolst.api.model.data.champion;

import at.lolst.api.model.data.Image;

public final class Passive {
	private final String description, name, sanitizedDescription;
	private final Image image;

	public Passive(String description, String name, String sanitizedDescription, Image image) {
		this.description = description;
		this.name = name;
		this.sanitizedDescription = sanitizedDescription;
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public String getName() {
		return name;
	}

	public String getSanitizedDescription() {
		return sanitizedDescription;
	}

	public Image getImage() {
		return image;
	}
}
