package at.lolst.api.model.data.item;

import java.util.List;

/**
 * 
 * @author jonathan
 *
 */
public final class ItemTree {
	private final String header;
	private final List<String> tags;

	public ItemTree(String header, List<String> tags) {
		this.header = header;
		this.tags = tags;
	}

	public String getHeader() {
		return header;
	}

	public List<String> getTags() {
		return tags;
	}
}
