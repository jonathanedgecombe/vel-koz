package at.lolst.api.model.data.mastery;

import java.util.Map;

/**
 * 
 * @author jonathan
 *
 */
public final class MasteryList {
	private final Map<String, Mastery> data;
	private final MasteryTree tree;
	private final String type, version;

	public MasteryList(Map<String, Mastery> data, MasteryTree tree, String type, String version) {
		this.data = data;
		this.tree = tree;
		this.type = type;
		this.version = version;
	}

	public Map<String, Mastery> getData() {
		return data;
	}

	public MasteryTree getTree() {
		return tree;
	}

	public String getType() {
		return type;
	}

	public String getVersion() {
		return version;
	}
}
