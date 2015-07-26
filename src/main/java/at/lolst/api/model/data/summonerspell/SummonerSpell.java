package at.lolst.api.model.data.summonerspell;

import java.util.List;

import at.lolst.api.model.data.Image;
import at.lolst.api.model.data.LevelTip;
import at.lolst.api.model.data.SpellVars;

/**
 * 
 * @author jonathan
 *
 */
public final class SummonerSpell {
	private final List<Double> cooldown;
	private final String cooldownBurn, costBurn, costType, description, key, name, rangeBurn, resource, sanitizedTooltip, sanitizedDescription, tooltip;
	private final List<SpellVars> vars;
	private final LevelTip leveltip;
	private final List<Image> altimages;
	private final Image image;
	// TODO private final (List<Integer> or String "self") range;

	public SummonerSpell(List<Double> cooldown, String cooldownBurn, String costBurn, String costType, String description, String key, String name, String rangeBurn, String resource, String sanitizedTooltip, String sanitizedDescription, String tooltip, List<SpellVars> vars, LevelTip leveltip, List<Image> altimages, Image image) {
		this.cooldown = cooldown;
		this.cooldownBurn = cooldownBurn;
		this.costBurn = costBurn;
		this.costType = costType;
		this.description = description;
		this.key = key;
		this.name = name;
		this.rangeBurn = rangeBurn;
		this.resource = resource;
		this.sanitizedTooltip = sanitizedTooltip;
		this.sanitizedDescription = sanitizedDescription;
		this.tooltip = tooltip;
		this.vars = vars;
		this.leveltip = leveltip;
		this.altimages = altimages;
		this.image = image;
	}

	public List<Double> getCooldown() {
		return cooldown;
	}

	public String getCooldownBurn() {
		return cooldownBurn;
	}

	public String getCostBurn() {
		return costBurn;
	}

	public String getCostType() {
		return costType;
	}

	public String getDescription() {
		return description;
	}

	public String getKey() {
		return key;
	}

	public String getName() {
		return name;
	}

	public String getRangeBurn() {
		return rangeBurn;
	}

	public String getResource() {
		return resource;
	}

	public String getSanitizedTooltip() {
		return sanitizedTooltip;
	}

	public String getSanitizedDescription() {
		return sanitizedDescription;
	}

	public String getTooltip() {
		return tooltip;
	}

	public List<SpellVars> getVars() {
		return vars;
	}

	public LevelTip getLeveltip() {
		return leveltip;
	}

	public List<Image> getAltimages() {
		return altimages;
	}

	public Image getImage() {
		return image;
	}
}
