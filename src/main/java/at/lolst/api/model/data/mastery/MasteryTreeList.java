package at.lolst.api.model.data.mastery;

import java.util.List;

public final class MasteryTreeList {
	private final List<MasteryTreeItem> masteryTreeItems;

	public MasteryTreeList(List<MasteryTreeItem> masteryTreeItems) {
		this.masteryTreeItems = masteryTreeItems;
	}

	public List<MasteryTreeItem> getMasteryTreeItems() {
		return masteryTreeItems;
	}
}
