package at.lolst.api.model.data.rune;

import java.util.Map;

import at.lolst.api.model.data.BasicData;

public final class RuneList {
	private final BasicData basic;
	private final Map<String, Rune> data;
	private final String type, version;

	public RuneList(BasicData basic, Map<String, Rune> data, String type, String version) {
		this.basic = basic;
		this.data = data;
		this.type = type;
		this.version = version;
	}

	public BasicData getBasic() {
		return basic;
	}

	public Map<String, Rune> getData() {
		return data;
	}

	public String getType() {
		return type;
	}

	public String getVersion() {
		return version;
	}
}
