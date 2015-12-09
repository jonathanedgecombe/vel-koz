package at.lolst.api.model.data.item;

import java.util.List;
import java.util.Map;

import at.lolst.api.model.data.BasicDataStats;
import at.lolst.api.model.data.Image;
import at.lolst.api.model.data.rune.MetaData;

public final class Item {
	private final String colloq;
	private final boolean consumeOnFull;
	private final boolean consumed;
	private final int depth;
	private final String description;
	private final Map<String, String> effect;
	private final List<String> from;
	private final Gold gold;
	private final String group;
	private final boolean hideFromAll;
	private final int id;
	private final Image image;
	private final boolean inStore;
	private final List<String> into;
	private final Map<String, Boolean> maps;
	private final String name;
	private final String plaintext;
	private final String requiredChampion;
	private final MetaData rune;
	private final String sanitizedDescription;
	private final int specialRecipe;
	private final int stacks;
	private final BasicDataStats stats;
	private final List<String> tags;

	public Item(String colloq, boolean consumeOnFull, boolean consumed,
			int depth, String description, Map<String, String> effect,
			List<String> from, Gold gold, String group, boolean hideFromAll,
			int id, Image image, boolean inStore, List<String> into,
			Map<String, Boolean> maps, String name, String plaintext,
			String requiredChampion, MetaData rune,
			String sanitizedDescription, int specialRecipe, int stacks,
			BasicDataStats stats, List<String> tags) {
		this.colloq = colloq;
		this.consumeOnFull = consumeOnFull;
		this.consumed = consumed;
		this.depth = depth;
		this.description = description;
		this.effect = effect;
		this.from = from;
		this.gold = gold;
		this.group = group;
		this.hideFromAll = hideFromAll;
		this.id = id;
		this.image = image;
		this.inStore = inStore;
		this.into = into;
		this.maps = maps;
		this.name = name;
		this.plaintext = plaintext;
		this.requiredChampion = requiredChampion;
		this.rune = rune;
		this.sanitizedDescription = sanitizedDescription;
		this.specialRecipe = specialRecipe;
		this.stacks = stacks;
		this.stats = stats;
		this.tags = tags;
	}

	public String getColloq() {
		return colloq;
	}

	public boolean isConsumeOnFull() {
		return consumeOnFull;
	}

	public boolean isConsumed() {
		return consumed;
	}

	public int getDepth() {
		return depth;
	}

	public String getDescription() {
		return description;
	}

	public Map<String, String> getEffect() {
		return effect;
	}

	public List<String> getFrom() {
		return from;
	}

	public Gold getGold() {
		return gold;
	}

	public String getGroup() {
		return group;
	}

	public boolean isHideFromAll() {
		return hideFromAll;
	}

	public int getId() {
		return id;
	}

	public Image getImage() {
		return image;
	}

	public boolean isInStore() {
		return inStore;
	}

	public List<String> getInto() {
		return into;
	}

	public Map<String, Boolean> getMaps() {
		return maps;
	}

	public String getName() {
		return name;
	}

	public String getPlaintext() {
		return plaintext;
	}

	public String getRequiredChampion() {
		return requiredChampion;
	}

	public MetaData getRune() {
		return rune;
	}

	public String getSanitizedDescription() {
		return sanitizedDescription;
	}

	public int getSpecialRecipe() {
		return specialRecipe;
	}

	public int getStacks() {
		return stacks;
	}

	public BasicDataStats getStats() {
		return stats;
	}

	public List<String> getTags() {
		return tags;
	}
}
