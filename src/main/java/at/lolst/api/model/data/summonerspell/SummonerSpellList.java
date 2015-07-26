package at.lolst.api.model.data.summonerspell;

import java.util.Map;

/**
 * 
 * @author jonathan
 *
 */
public final class SummonerSpellList {
	private final Map<String, SummonerSpell> data;
	private final String type, version;

	public SummonerSpellList(Map<String, SummonerSpell> data, String type, String version) {
		this.data = data;
		this.type = type;
		this.version = version;
	}

	public Map<String, SummonerSpell> getData() {
		return data;
	}

	public String getType() {
		return type;
	}

	public String getVersion() {
		return version;
	}
}
