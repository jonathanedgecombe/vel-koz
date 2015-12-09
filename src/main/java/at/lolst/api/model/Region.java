package at.lolst.api.model;

import java.util.HashMap;
import java.util.Map;

public enum Region {
	EUW("EUW", "euw.api.pvp.net", "EUW1"),
	EUNE("EUNE", "eune.api.pvp.net", "EUN1"),
	NA("NA", "na.api.pvp.net", "NA1"),
	BR("BR", "br.api.pvp.net", "BR1"),
	TR("TR", "tr.api.pvp.net", "TR1"),
	RU("RU", "ru.api.pvp.net", "RU"),
	LAN("LAN", "lan.api.pvp.net", "LA1"),
	LAS("LAS", "las.api.pvp.net", "LA2"),
	OCE("OCE", "oce.api.pvp.net", "OC1"),
	KR("KR", "kr.api.pvp.net", "KR"),
	GLOBAL("PROD", "global.api.pvp.net", null),
	;

	private final static Map<String, Region> regions = new HashMap<>();

	static {
		for (Region r : values()) {
			regions.put(r.getName(), r);
		}
	}

	public static Region forName(String name) {
		return regions.get(name.toUpperCase());
	}

	private final String name, nameLower, url, platformId;

	Region(String name, String url, String platformId) {
		this.name = name;
		this.nameLower = name.toLowerCase();
		this.url = url;
		this.platformId = platformId;
	}

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}

	public String getPlatformId() {
		return platformId;
	}

	@Override
	public String toString() {
		return nameLower;
	}
}
