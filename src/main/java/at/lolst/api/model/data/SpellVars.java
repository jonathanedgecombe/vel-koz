package at.lolst.api.model.data;

import java.util.List;

/**
 * 
 * @author jonathan
 *
 */
public final class SpellVars {
	private final List<Double> coeff;
	private final String dyn, key, link, ranksWith;

	public SpellVars(List<Double> coeff, String dyn, String key, String link, String ranksWith) {
		this.coeff = coeff;
		this.dyn = dyn;
		this.key = key;
		this.link = link;
		this.ranksWith = ranksWith;
	}

	public List<Double> getCoeff() {
		return coeff;
	}

	public String getDyn() {
		return dyn;
	}

	public String getKey() {
		return key;
	}

	public String getLink() {
		return link;
	}

	public String getRanksWith() {
		return ranksWith;
	}
}
