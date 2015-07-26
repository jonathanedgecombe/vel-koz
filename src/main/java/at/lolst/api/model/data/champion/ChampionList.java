package at.lolst.api.model.data.champion;

import java.util.Map;

/**
 * 
 * @author jonathan
 *
 */
public final class ChampionList {
	private final Map<String, Champion> data;
	private final Map<String, String> keys;
	private final String format, type, version;

	public ChampionList(Map<String, Champion> data, Map<String, String> keys, String format, String type, String version) {
		this.data = data;
		this.keys = keys;
		this.format = format;
		this.type = type;
		this.version = version;
	}

	public Map<String, Champion> getData() {
		return data;
	}

	public Map<String, String> getKeys() {
		return keys;
	}

	public String getFormat() {
		return format;
	}

	public String getType() {
		return type;
	}

	public String getVersion() {
		return version;
	}
}
