package at.lolst.api.model.data;

import java.util.List;

/**
 * 
 * @author jonathan
 *
 */
public final class LevelTip {
	private final List<String> effect, label;

	public LevelTip(List<String> effect, List<String> label) {
		this.effect = effect;
		this.label = label;
	}

	public List<String> getEffect() {
		return effect;
	}

	public List<String> getLabel() {
		return label;
	}
}
