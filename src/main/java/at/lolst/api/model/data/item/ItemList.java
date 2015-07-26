package at.lolst.api.model.data.item;

import java.util.List;
import java.util.Map;

import at.lolst.api.model.data.BasicData;

/**
 * 
 * @author jonathan
 *
 */
public final class ItemList {
	private final BasicData basic;
	private final Map<String, Item> data;
	private final List<Group> groups;
	private final List<ItemTree> tree;
	private final String type, version;

	public ItemList(BasicData basic, Map<String, Item> data, List<Group> groups, List<ItemTree> tree, String type, String version) {
		this.basic = basic;
		this.data = data;
		this.groups = groups;
		this.tree = tree;
		this.type = type;
		this.version = version;
	}

	public BasicData getBasic() {
		return basic;
	}

	public Map<String, Item> getData() {
		return data;
	}

	public List<Group> getGroups() {
		return groups;
	}

	public List<ItemTree> getTree() {
		return tree;
	}

	public String getType() {
		return type;
	}

	public String getVersion() {
		return version;
	}
}
