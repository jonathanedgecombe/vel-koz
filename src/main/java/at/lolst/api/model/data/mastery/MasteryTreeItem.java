package at.lolst.api.model.data.mastery;

public final class MasteryTreeItem {
	private final int masteryId;
	private final String prereq;

	public MasteryTreeItem(int masteryId, String prereq) {
		this.masteryId = masteryId;
		this.prereq = prereq;
	}

	public int getMasteryId() {
		return masteryId;
	}

	public String getPrereq() {
		return prereq;
	}
}
