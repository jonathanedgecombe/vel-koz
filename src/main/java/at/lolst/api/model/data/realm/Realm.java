package at.lolst.api.model.data.realm;

import java.util.Map;

public final class Realm {
	private final String cdn, css, dd, l, lg, store, v;
	private final Map<String, String> n;
	private final int profileiconmax;

	public Realm(String cdn, String css, String dd, String l, String lg, String store, String v, Map<String, String> n, int profileiconmax) {
		this.cdn = cdn;
		this.css = css;
		this.dd = dd;
		this.l = l;
		this.lg = lg;
		this.store = store;
		this.v = v;
		this.n = n;
		this.profileiconmax = profileiconmax;
	}

	public String getCDNUrl() {
		return cdn;
	}

	public String getCSSUrl() {
		return css;
	}

	public String getDDVersion() {
		return dd;
	}

	public String getLanguage() {
		return l;
	}

	public String getLegacyScript() {
		return lg;
	}

	public String getStore() {
		return store;
	}

	public String getVersion() {
		return v;
	}

	public Map<String, String> getDataVersions() {
		return n;
	}

	public int getProfileIconMax() {
		return profileiconmax;
	}
}
