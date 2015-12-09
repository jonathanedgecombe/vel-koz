package at.lolst.api.model.match;

public final class ParticipantTimeline {
	private final ParticipantTimelineData ancientGolemAssistsPerMinCounts,
			ancientGolemKillsPerMinCounts, assistedLaneDeathsPerMinDeltas,
			assistedLaneKillsPerMinDeltas, baronAssistsPerMinCounts,
			baronKillsPerMinCounts, creepsPerMinDeltas, csDiffPerMinDeltas,
			damageTakenDiffPerMinDeltas, damageTakenPerMinDeltas,
			dragonAssistsPerMinCounts, dragonKillsPerMinCounts,
			elderLizardAssistsPerMinCounts, elderLizardKillsPerMinCounts,
			goldPerMinDeltas, inhibitorAssistsPerMinCounts,
			inhibitorKillsPerMinCounts, towerAssistsPerMinCounts,
			towerKillsPerMinCounts, towerKillsPerMinDeltas,
			vilemawAssistsPerMinCounts, vilemawKillsPerMinCounts,
			wardsPerMinDeltas, xpDiffPerMinDeltas, xpPerMinDeltas;

	private final String lane, role;

	public ParticipantTimeline(
			ParticipantTimelineData ancientGolemAssistsPerMinCounts,
			ParticipantTimelineData ancientGolemKillsPerMinCounts,
			ParticipantTimelineData assistedLaneDeathsPerMinDeltas,
			ParticipantTimelineData assistedLaneKillsPerMinDeltas,
			ParticipantTimelineData baronAssistsPerMinCounts,
			ParticipantTimelineData baronKillsPerMinCounts,
			ParticipantTimelineData creepsPerMinDeltas,
			ParticipantTimelineData csDiffPerMinDeltas,
			ParticipantTimelineData damageTakenDiffPerMinDeltas,
			ParticipantTimelineData damageTakenPerMinDeltas,
			ParticipantTimelineData dragonAssistsPerMinCounts,
			ParticipantTimelineData dragonKillsPerMinCounts,
			ParticipantTimelineData elderLizardAssistsPerMinCounts,
			ParticipantTimelineData elderLizardKillsPerMinCounts,
			ParticipantTimelineData goldPerMinDeltas,
			ParticipantTimelineData inhibitorAssistsPerMinCounts,
			ParticipantTimelineData inhibitorKillsPerMinCounts,
			ParticipantTimelineData towerAssistsPerMinCounts,
			ParticipantTimelineData towerKillsPerMinCounts,
			ParticipantTimelineData towerKillsPerMinDeltas,
			ParticipantTimelineData vilemawAssistsPerMinCounts,
			ParticipantTimelineData vilemawKillsPerMinCounts,
			ParticipantTimelineData wardsPerMinDeltas,
			ParticipantTimelineData xpDiffPerMinDeltas,
			ParticipantTimelineData xpPerMinDeltas,
			String lane, String role) {
		this.ancientGolemAssistsPerMinCounts = ancientGolemAssistsPerMinCounts;
		this.ancientGolemKillsPerMinCounts = ancientGolemKillsPerMinCounts;
		this.assistedLaneDeathsPerMinDeltas = assistedLaneDeathsPerMinDeltas;
		this.assistedLaneKillsPerMinDeltas = assistedLaneKillsPerMinDeltas;
		this.baronAssistsPerMinCounts = baronAssistsPerMinCounts;
		this.baronKillsPerMinCounts = baronKillsPerMinCounts;
		this.creepsPerMinDeltas = creepsPerMinDeltas;
		this.csDiffPerMinDeltas = csDiffPerMinDeltas;
		this.damageTakenDiffPerMinDeltas = damageTakenDiffPerMinDeltas;
		this.damageTakenPerMinDeltas = damageTakenPerMinDeltas;
		this.dragonAssistsPerMinCounts = dragonAssistsPerMinCounts;
		this.dragonKillsPerMinCounts = dragonKillsPerMinCounts;
		this.elderLizardAssistsPerMinCounts = elderLizardAssistsPerMinCounts;
		this.elderLizardKillsPerMinCounts = elderLizardKillsPerMinCounts;
		this.goldPerMinDeltas = goldPerMinDeltas;
		this.inhibitorAssistsPerMinCounts = inhibitorAssistsPerMinCounts;
		this.inhibitorKillsPerMinCounts = inhibitorKillsPerMinCounts;
		this.towerAssistsPerMinCounts = towerAssistsPerMinCounts;
		this.towerKillsPerMinCounts = towerKillsPerMinCounts;
		this.towerKillsPerMinDeltas = towerKillsPerMinDeltas;
		this.vilemawAssistsPerMinCounts = vilemawAssistsPerMinCounts;
		this.vilemawKillsPerMinCounts = vilemawKillsPerMinCounts;
		this.wardsPerMinDeltas = wardsPerMinDeltas;
		this.xpDiffPerMinDeltas = xpDiffPerMinDeltas;
		this.xpPerMinDeltas = xpPerMinDeltas;
		this.lane = lane;
		this.role = role;
	}

	public ParticipantTimelineData getAncientGolemAssistsPerMinCounts() {
		return ancientGolemAssistsPerMinCounts;
	}

	public ParticipantTimelineData getAncientGolemKillsPerMinCounts() {
		return ancientGolemKillsPerMinCounts;
	}

	public ParticipantTimelineData getAssistedLaneDeathsPerMinDeltas() {
		return assistedLaneDeathsPerMinDeltas;
	}

	public ParticipantTimelineData getAssistedLaneKillsPerMinDeltas() {
		return assistedLaneKillsPerMinDeltas;
	}

	public ParticipantTimelineData getBaronAssistsPerMinCounts() {
		return baronAssistsPerMinCounts;
	}

	public ParticipantTimelineData getBaronKillsPerMinCounts() {
		return baronKillsPerMinCounts;
	}

	public ParticipantTimelineData getCreepsPerMinDeltas() {
		return creepsPerMinDeltas;
	}

	public ParticipantTimelineData getCsDiffPerMinDeltas() {
		return csDiffPerMinDeltas;
	}

	public ParticipantTimelineData getDamageTakenDiffPerMinDeltas() {
		return damageTakenDiffPerMinDeltas;
	}

	public ParticipantTimelineData getDamageTakenPerMinDeltas() {
		return damageTakenPerMinDeltas;
	}

	public ParticipantTimelineData getDragonAssistsPerMinCounts() {
		return dragonAssistsPerMinCounts;
	}

	public ParticipantTimelineData getDragonKillsPerMinCounts() {
		return dragonKillsPerMinCounts;
	}

	public ParticipantTimelineData getElderLizardAssistsPerMinCounts() {
		return elderLizardAssistsPerMinCounts;
	}

	public ParticipantTimelineData getElderLizardKillsPerMinCounts() {
		return elderLizardKillsPerMinCounts;
	}

	public ParticipantTimelineData getGoldPerMinDeltas() {
		return goldPerMinDeltas;
	}

	public ParticipantTimelineData getInhibitorAssistsPerMinCounts() {
		return inhibitorAssistsPerMinCounts;
	}

	public ParticipantTimelineData getInhibitorKillsPerMinCounts() {
		return inhibitorKillsPerMinCounts;
	}

	public ParticipantTimelineData getTowerAssistsPerMinCounts() {
		return towerAssistsPerMinCounts;
	}

	public ParticipantTimelineData getTowerKillsPerMinCounts() {
		return towerKillsPerMinCounts;
	}

	public ParticipantTimelineData getTowerKillsPerMinDeltas() {
		return towerKillsPerMinDeltas;
	}

	public ParticipantTimelineData getVilemawAssistsPerMinCounts() {
		return vilemawAssistsPerMinCounts;
	}

	public ParticipantTimelineData getVilemawKillsPerMinCounts() {
		return vilemawKillsPerMinCounts;
	}

	public ParticipantTimelineData getWardsPerMinDeltas() {
		return wardsPerMinDeltas;
	}

	public ParticipantTimelineData getXpDiffPerMinDeltas() {
		return xpDiffPerMinDeltas;
	}

	public ParticipantTimelineData getXpPerMinDeltas() {
		return xpPerMinDeltas;
	}

	public String getLane() {
		return lane;
	}

	public String getRole() {
		return role;
	}
}
