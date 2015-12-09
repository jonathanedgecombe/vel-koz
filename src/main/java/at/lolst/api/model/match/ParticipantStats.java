package at.lolst.api.model.match;

public final class ParticipantStats {
	private final long assists;
	private final long champLevel;
	private final long combatPlayerScore;
	private final long deaths;
	private final long doubleKills;
	private final boolean firstBloodAssist;
	private final boolean firstBloodKill;
	private final boolean firstInhibitorAssist;
	private final boolean firstInhibitorKill;
	private final boolean firstTowerAssist;
	private final boolean firstTowerKill;
	private final long goldEarned;
	private final long goldSpent;
	private final long inhibitorKills;
	private final long item0;
	private final long item1;
	private final long item2;
	private final long item3;
	private final long item4;
	private final long item5;
	private final long item6;
	private final long killingSprees;
	private final long kills;
	private final long largestCriticalStrike;
	private final long largestKillingSpree;
	private final long largestMultiKill;
	private final long magicDamageDealt;
	private final long magicDamageDealtToChampions;
	private final long magicDamageTaken;
	private final long minionsKilled;
	private final long neutralMinionsKilled;
	private final long neutralMinionsKilledEnemyJungle;
	private final long neutralMinionsKilledTeamJungle;
	private final long nodeCapture;
	private final long nodeCaptureAssist;
	private final long nodeNeutralize;
	private final long nodeNeutralizeAssist;
	private final long objectivePlayerScore;
	private final long pentaKills;
	private final long physicalDamageDealt;
	private final long physicalDamageDealtToChampions;
	private final long physicalDamageTaken;
	private final long quadraKills;
	private final long sightWardsBoughtInGame;
	private final long teamObjective;
	private final long totalDamageDealt;
	private final long totalDamageDealtToChampions;
	private final long totalDamageTaken;
	private final long totalHeal;
	private final long totalPlayerScore;
	private final long totalScoreRank;
	private final long totalTimeCrowdControlDealt;
	private final long totalUnitsHealed;
	private final long towerKills;
	private final long tripleKills;
	private final long trueDamageDealt;
	private final long trueDamageDealtToChampions;
	private final long trueDamageTaken;
	private final long unrealKills;
	private final long visionWardsBoughtInGame;
	private final long wardsKilled;
	private final long wardsPlaced;
	private final boolean winner;

	public ParticipantStats(long assists, long champLevel,
			long combatPlayerScore, long deaths, long doubleKills,
			boolean firstBloodAssist, boolean firstBloodKill,
			boolean firstInhibitorAssist, boolean firstInhibitorKill,
			boolean firstTowerAssist, boolean firstTowerKill, long goldEarned,
			long goldSpent, long inhibitorKills, long item0, long item1,
			long item2, long item3, long item4, long item5, long item6,
			long killingSprees, long kills, long largestCriticalStrike,
			long largestKillingSpree, long largestMultiKill,
			long magicDamageDealt, long magicDamageDealtToChampions,
			long magicDamageTaken, long minionsKilled,
			long neutralMinionsKilled, long neutralMinionsKilledEnemyJungle,
			long neutralMinionsKilledTeamJungle, long nodeCapture,
			long nodeCaptureAssist, long nodeNeutralize,
			long nodeNeutralizeAssist, long objectivePlayerScore,
			long pentaKills, long physicalDamageDealt,
			long physicalDamageDealtToChampions, long physicalDamageTaken,
			long quadraKills, long sightWardsBoughtInGame, long teamObjective,
			long totalDamageDealt, long totalDamageDealtToChampions,
			long totalDamageTaken, long totalHeal, long totalPlayerScore,
			long totalScoreRank, long totalTimeCrowdControlDealt,
			long totalUnitsHealed, long towerKills, long tripleKills,
			long trueDamageDealt, long trueDamageDealtToChampions,
			long trueDamageTaken, long unrealKills,
			long visionWardsBoughtInGame, long wardsKilled, long wardsPlaced,
			boolean winner) {
		this.assists = assists;
		this.champLevel = champLevel;
		this.combatPlayerScore = combatPlayerScore;
		this.deaths = deaths;
		this.doubleKills = doubleKills;
		this.firstBloodAssist = firstBloodAssist;
		this.firstBloodKill = firstBloodKill;
		this.firstInhibitorAssist = firstInhibitorAssist;
		this.firstInhibitorKill = firstInhibitorKill;
		this.firstTowerAssist = firstTowerAssist;
		this.firstTowerKill = firstTowerKill;
		this.goldEarned = goldEarned;
		this.goldSpent = goldSpent;
		this.inhibitorKills = inhibitorKills;
		this.item0 = item0;
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
		this.item5 = item5;
		this.item6 = item6;
		this.killingSprees = killingSprees;
		this.kills = kills;
		this.largestCriticalStrike = largestCriticalStrike;
		this.largestKillingSpree = largestKillingSpree;
		this.largestMultiKill = largestMultiKill;
		this.magicDamageDealt = magicDamageDealt;
		this.magicDamageDealtToChampions = magicDamageDealtToChampions;
		this.magicDamageTaken = magicDamageTaken;
		this.minionsKilled = minionsKilled;
		this.neutralMinionsKilled = neutralMinionsKilled;
		this.neutralMinionsKilledEnemyJungle = neutralMinionsKilledEnemyJungle;
		this.neutralMinionsKilledTeamJungle = neutralMinionsKilledTeamJungle;
		this.nodeCapture = nodeCapture;
		this.nodeCaptureAssist = nodeCaptureAssist;
		this.nodeNeutralize = nodeNeutralize;
		this.nodeNeutralizeAssist = nodeNeutralizeAssist;
		this.objectivePlayerScore = objectivePlayerScore;
		this.pentaKills = pentaKills;
		this.physicalDamageDealt = physicalDamageDealt;
		this.physicalDamageDealtToChampions = physicalDamageDealtToChampions;
		this.physicalDamageTaken = physicalDamageTaken;
		this.quadraKills = quadraKills;
		this.sightWardsBoughtInGame = sightWardsBoughtInGame;
		this.teamObjective = teamObjective;
		this.totalDamageDealt = totalDamageDealt;
		this.totalDamageDealtToChampions = totalDamageDealtToChampions;
		this.totalDamageTaken = totalDamageTaken;
		this.totalHeal = totalHeal;
		this.totalPlayerScore = totalPlayerScore;
		this.totalScoreRank = totalScoreRank;
		this.totalTimeCrowdControlDealt = totalTimeCrowdControlDealt;
		this.totalUnitsHealed = totalUnitsHealed;
		this.towerKills = towerKills;
		this.tripleKills = tripleKills;
		this.trueDamageDealt = trueDamageDealt;
		this.trueDamageDealtToChampions = trueDamageDealtToChampions;
		this.trueDamageTaken = trueDamageTaken;
		this.unrealKills = unrealKills;
		this.visionWardsBoughtInGame = visionWardsBoughtInGame;
		this.wardsKilled = wardsKilled;
		this.wardsPlaced = wardsPlaced;
		this.winner = winner;
	}

	public long getAssists() {
		return assists;
	}

	public long getChampLevel() {
		return champLevel;
	}

	public long getCombatPlayerScore() {
		return combatPlayerScore;
	}

	public long getDeaths() {
		return deaths;
	}

	public long getDoubleKills() {
		return doubleKills;
	}

	public boolean isFirstBloodAssist() {
		return firstBloodAssist;
	}

	public boolean isFirstBloodKill() {
		return firstBloodKill;
	}

	public boolean isFirstInhibitorAssist() {
		return firstInhibitorAssist;
	}

	public boolean isFirstInhibitorKill() {
		return firstInhibitorKill;
	}

	public boolean isFirstTowerAssist() {
		return firstTowerAssist;
	}

	public boolean isFirstTowerKill() {
		return firstTowerKill;
	}

	public long getGoldEarned() {
		return goldEarned;
	}

	public long getGoldSpent() {
		return goldSpent;
	}

	public long getInhibitorKills() {
		return inhibitorKills;
	}

	public long getItem0() {
		return item0;
	}

	public long getItem1() {
		return item1;
	}

	public long getItem2() {
		return item2;
	}

	public long getItem3() {
		return item3;
	}

	public long getItem4() {
		return item4;
	}

	public long getItem5() {
		return item5;
	}

	public long getItem6() {
		return item6;
	}

	public long getKillingSprees() {
		return killingSprees;
	}

	public long getKills() {
		return kills;
	}

	public long getLargestCriticalStrike() {
		return largestCriticalStrike;
	}

	public long getLargestKillingSpree() {
		return largestKillingSpree;
	}

	public long getLargestMultiKill() {
		return largestMultiKill;
	}

	public long getMagicDamageDealt() {
		return magicDamageDealt;
	}

	public long getMagicDamageDealtToChampions() {
		return magicDamageDealtToChampions;
	}

	public long getMagicDamageTaken() {
		return magicDamageTaken;
	}

	public long getMinionsKilled() {
		return minionsKilled;
	}

	public long getNeutralMinionsKilled() {
		return neutralMinionsKilled;
	}

	public long getNeutralMinionsKilledEnemyJungle() {
		return neutralMinionsKilledEnemyJungle;
	}

	public long getNeutralMinionsKilledTeamJungle() {
		return neutralMinionsKilledTeamJungle;
	}

	public long getNodeCapture() {
		return nodeCapture;
	}

	public long getNodeCaptureAssist() {
		return nodeCaptureAssist;
	}

	public long getNodeNeutralize() {
		return nodeNeutralize;
	}

	public long getNodeNeutralizeAssist() {
		return nodeNeutralizeAssist;
	}

	public long getObjectivePlayerScore() {
		return objectivePlayerScore;
	}

	public long getPentaKills() {
		return pentaKills;
	}

	public long getPhysicalDamageDealt() {
		return physicalDamageDealt;
	}

	public long getPhysicalDamageDealtToChampions() {
		return physicalDamageDealtToChampions;
	}

	public long getPhysicalDamageTaken() {
		return physicalDamageTaken;
	}

	public long getQuadraKills() {
		return quadraKills;
	}

	public long getSightWardsBoughtInGame() {
		return sightWardsBoughtInGame;
	}

	public long getTeamObjective() {
		return teamObjective;
	}

	public long getTotalDamageDealt() {
		return totalDamageDealt;
	}

	public long getTotalDamageDealtToChampions() {
		return totalDamageDealtToChampions;
	}

	public long getTotalDamageTaken() {
		return totalDamageTaken;
	}

	public long getTotalHeal() {
		return totalHeal;
	}

	public long getTotalPlayerScore() {
		return totalPlayerScore;
	}

	public long getTotalScoreRank() {
		return totalScoreRank;
	}

	public long getTotalTimeCrowdControlDealt() {
		return totalTimeCrowdControlDealt;
	}

	public long getTotalUnitsHealed() {
		return totalUnitsHealed;
	}

	public long getTowerKills() {
		return towerKills;
	}

	public long getTripleKills() {
		return tripleKills;
	}

	public long getTrueDamageDealt() {
		return trueDamageDealt;
	}

	public long getTrueDamageDealtToChampions() {
		return trueDamageDealtToChampions;
	}

	public long getTrueDamageTaken() {
		return trueDamageTaken;
	}

	public long getUnrealKills() {
		return unrealKills;
	}

	public long getVisionWardsBoughtInGame() {
		return visionWardsBoughtInGame;
	}

	public long getWardsKilled() {
		return wardsKilled;
	}

	public long getWardsPlaced() {
		return wardsPlaced;
	}

	public boolean isWinner() {
		return winner;
	}
}
