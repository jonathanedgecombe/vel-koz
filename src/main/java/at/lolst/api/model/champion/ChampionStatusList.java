package at.lolst.api.model.champion;

import java.util.List;

public final class ChampionStatusList {
	private final List<ChampionStatus> champions;

	public ChampionStatusList(List<ChampionStatus> champions) {
		this.champions = champions;
	}

	public List<ChampionStatus> getChampions() {
		return champions;
	}

	@Override
	public String toString() {
		return "ChampionList{" + champions + "}";
	}
}
