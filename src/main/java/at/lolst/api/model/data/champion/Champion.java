package at.lolst.api.model.data.champion;

import java.util.List;

import at.lolst.api.model.data.Image;

/**
 * 
 * @author jonathan
 *
 */
public final class Champion {
	private final List<String> allytips, enemytips, tags;
	private final String blurb, key, lore, name, partype, title;
	private final int id;
	private final List<Recommended> recommended;
	private final List<Skin> skins;
	private final List<ChampionSpell> spells;
	private final Image image;
	private final Info info;
	private final Passive passive;
	private final Stats stats;

	public Champion(List<String> allytips, List<String> enemytips, List<String> tags, String blurb, String key, String lore, String name, String partype, String title, int id, List<Recommended> recommended, List<Skin> skins, List<ChampionSpell> spells, Image image, Info info, Passive passive, Stats stats) {
		this.allytips = allytips;
		this.enemytips = enemytips;
		this.tags = tags;
		this.blurb = blurb;
		this.key = key;
		this.lore = lore;
		this.name = name;
		this.partype = partype;
		this.title = title;
		this.id = id;
		this.recommended = recommended;
		this.skins = skins;
		this.spells = spells;
		this.image = image;
		this.info = info;
		this.passive = passive;
		this.stats = stats;
	}

	public List<Recommended> getRecommended() {
		return recommended;
	}

	public List<Skin> getSkins() {
		return skins;
	}

	public List<ChampionSpell> getSpells() {
		return spells;
	}

	public Image getImage() {
		return image;
	}

	public Info getInfo() {
		return info;
	}

	public Passive getPassive() {
		return passive;
	}

	public Stats getStats() {
		return stats;
	}

	public List<String> getAllytips() {
		return allytips;
	}

	public List<String> getEnemytips() {
		return enemytips;
	}

	public List<String> getTags() {
		return tags;
	}

	public String getBlurb() {
		return blurb;
	}

	public String getKey() {
		return key;
	}

	public String getLore() {
		return lore;
	}

	public String getName() {
		return name;
	}

	public String getPartype() {
		return partype;
	}

	public String getTitle() {
		return title;
	}

	public int getId() {
		return id;
	}
}
