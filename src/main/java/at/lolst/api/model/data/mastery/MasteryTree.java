package at.lolst.api.model.data.mastery;

import java.util.List;

/**
 * 
 * @author jonathan
 *
 */
public final class MasteryTree {
	private final List<MasteryTreeList> Defense, Offense, Utility;

	public MasteryTree(List<MasteryTreeList> Defense, List<MasteryTreeList> Offense, List<MasteryTreeList> Utility) {
		this.Defense = Defense;
		this.Offense = Offense;
		this.Utility = Utility;
	}

	public List<MasteryTreeList> getDefense() {
		return Defense;
	}

	public List<MasteryTreeList> getOffense() {
		return Offense;
	}

	public List<MasteryTreeList> getUtility() {
		return Utility;
	}
}
