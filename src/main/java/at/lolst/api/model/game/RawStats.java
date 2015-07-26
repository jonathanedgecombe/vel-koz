package at.lolst.api.model.game;

/**
 * 
 * @author jonathan
 *
 */
public final class RawStats {
	private final int assists, barracksKilled, championsKilled,
			combatPlayerScore, consumablesPurchased, damageDealtPlayer,
			doubleKills, firstBlood, gold, goldEarned, goldSpent, item0, item1,
			item2, item3, item4, item5, item6, itemsPurchased, killingSprees,
			largestCriticalStrike, largestKillingSpree, largestMultiKill,
			legendaryItemsCreated, level, magicDamageDealtPlayer,
			magicDamageDealtToChampions, magicDamageTaken, minionsDenied,
			minionsKilled, neutralMinionsKilled,
			neutralMinionsKilledEnemyJungle, neutralMinionsKilledYourJungle,
			nodeCapture, nodeCaptureAssist, nodeNeutralize,
			nodeNeutralizeAssist, numDeaths, numItemsBought,
			objectivePlayerScore, pentaKills, physicalDamageDealtPlayer,
			physicalDamageDealtToChampions, physicalDamageTaken, quadraKills,
			sightWardsBought, spell1Cast, spell2Cast, spell3Cast, spell4Cast,
			summonSpell1Cast, summonSpell2Cast, superMonsterKilled, team,
			teamObjective, timePlayed, totalDamageDealt,
			totalDamageDealtToChampions, totalDamageTaken, totalHeal,
			totalPlayerScore, totalScoreRank, totalTimeCrowdControlDealt,
			totalUnitsHealed, tripleKills, trueDamageDealtPlayer,
			trueDamageDealtToChampions, trueDamageTaken, turretsKilled,
			unrealKills, victoryPointTotal, visionWardsBought, wardKilled,
			wardPlaced;

	private final boolean win, nexusKilled;

	public RawStats(int assists, int barracksKilled, int championsKilled,
			int combatPlayerScore, int consumablesPurchased,
			int damageDealtPlayer, int doubleKills, int firstBlood, int gold,
			int goldEarned, int goldSpent, int item0, int item1, int item2,
			int item3, int item4, int item5, int item6, int itemsPurchased,
			int killingSprees, int largestCriticalStrike,
			int largestKillingSpree, int largestMultiKill,
			int legendaryItemsCreated, int level, int magicDamageDealtPlayer,
			int magicDamageDealtToChampions, int magicDamageTaken,
			int minionsDenied, int minionsKilled, int neutralMinionsKilled,
			int neutralMinionsKilledEnemyJungle,
			int neutralMinionsKilledYourJungle, int nodeCapture,
			int nodeCaptureAssist, int nodeNeutralize,
			int nodeNeutralizeAssist, int numDeaths, int numItemsBought,
			int objectivePlayerScore, int pentaKills,
			int physicalDamageDealtPlayer, int physicalDamageDealtToChampions,
			int physicalDamageTaken, int quadraKills, int sightWardsBought,
			int spell1Cast, int spell2Cast, int spell3Cast, int spell4Cast,
			int summonSpell1Cast, int summonSpell2Cast, int superMonsterKilled,
			int team, int teamObjective, int timePlayed, int totalDamageDealt,
			int totalDamageDealtToChampions, int totalDamageTaken,
			int totalHeal, int totalPlayerScore, int totalScoreRank,
			int totalTimeCrowdControlDealt, int totalUnitsHealed,
			int tripleKills, int trueDamageDealtPlayer,
			int trueDamageDealtToChampions, int trueDamageTaken,
			int turretsKilled, int unrealKills, int victoryPointTotal,
			int visionWardsBought, int wardKilled, int wardPlaced, boolean win,
			boolean nexusKilled) {
		this.assists = assists;
		this.barracksKilled = barracksKilled;
		this.championsKilled = championsKilled;
		this.combatPlayerScore = combatPlayerScore;
		this.consumablesPurchased = consumablesPurchased;
		this.damageDealtPlayer = damageDealtPlayer;
		this.doubleKills = doubleKills;
		this.firstBlood = firstBlood;
		this.gold = gold;
		this.goldEarned = goldEarned;
		this.goldSpent = goldSpent;
		this.item0 = item0;
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
		this.item5 = item5;
		this.item6 = item6;
		this.itemsPurchased = itemsPurchased;
		this.killingSprees = killingSprees;
		this.largestCriticalStrike = largestCriticalStrike;
		this.largestKillingSpree = largestKillingSpree;
		this.largestMultiKill = largestMultiKill;
		this.legendaryItemsCreated = legendaryItemsCreated;
		this.level = level;
		this.magicDamageDealtPlayer = magicDamageDealtPlayer;
		this.magicDamageDealtToChampions = magicDamageDealtToChampions;
		this.magicDamageTaken = magicDamageTaken;
		this.minionsDenied = minionsDenied;
		this.minionsKilled = minionsKilled;
		this.neutralMinionsKilled = neutralMinionsKilled;
		this.neutralMinionsKilledEnemyJungle = neutralMinionsKilledEnemyJungle;
		this.neutralMinionsKilledYourJungle = neutralMinionsKilledYourJungle;
		this.nodeCapture = nodeCapture;
		this.nodeCaptureAssist = nodeCaptureAssist;
		this.nodeNeutralize = nodeNeutralize;
		this.nodeNeutralizeAssist = nodeNeutralizeAssist;
		this.numDeaths = numDeaths;
		this.numItemsBought = numItemsBought;
		this.objectivePlayerScore = objectivePlayerScore;
		this.pentaKills = pentaKills;
		this.physicalDamageDealtPlayer = physicalDamageDealtPlayer;
		this.physicalDamageDealtToChampions = physicalDamageDealtToChampions;
		this.physicalDamageTaken = physicalDamageTaken;
		this.quadraKills = quadraKills;
		this.sightWardsBought = sightWardsBought;
		this.spell1Cast = spell1Cast;
		this.spell2Cast = spell2Cast;
		this.spell3Cast = spell3Cast;
		this.spell4Cast = spell4Cast;
		this.summonSpell1Cast = summonSpell1Cast;
		this.summonSpell2Cast = summonSpell2Cast;
		this.superMonsterKilled = superMonsterKilled;
		this.team = team;
		this.teamObjective = teamObjective;
		this.timePlayed = timePlayed;
		this.totalDamageDealt = totalDamageDealt;
		this.totalDamageDealtToChampions = totalDamageDealtToChampions;
		this.totalDamageTaken = totalDamageTaken;
		this.totalHeal = totalHeal;
		this.totalPlayerScore = totalPlayerScore;
		this.totalScoreRank = totalScoreRank;
		this.totalTimeCrowdControlDealt = totalTimeCrowdControlDealt;
		this.totalUnitsHealed = totalUnitsHealed;
		this.tripleKills = tripleKills;
		this.trueDamageDealtPlayer = trueDamageDealtPlayer;
		this.trueDamageDealtToChampions = trueDamageDealtToChampions;
		this.trueDamageTaken = trueDamageTaken;
		this.turretsKilled = turretsKilled;
		this.unrealKills = unrealKills;
		this.victoryPointTotal = victoryPointTotal;
		this.visionWardsBought = visionWardsBought;
		this.wardKilled = wardKilled;
		this.wardPlaced = wardPlaced;
		this.win = win;
		this.nexusKilled = nexusKilled;
	}

	public int getAssists() {
		return assists;
	}

	public int getBarracksKilled() {
		return barracksKilled;
	}

	public int getChampionsKilled() {
		return championsKilled;
	}

	public int getCombatPlayerScore() {
		return combatPlayerScore;
	}

	public int getConsumablesPurchased() {
		return consumablesPurchased;
	}

	public int getDamageDealtPlayer() {
		return damageDealtPlayer;
	}

	public int getDoubleKills() {
		return doubleKills;
	}

	public int getFirstBlood() {
		return firstBlood;
	}

	public int getGold() {
		return gold;
	}

	public int getGoldEarned() {
		return goldEarned;
	}

	public int getGoldSpent() {
		return goldSpent;
	}

	public int getItem0() {
		return item0;
	}

	public int getItem1() {
		return item1;
	}

	public int getItem2() {
		return item2;
	}

	public int getItem3() {
		return item3;
	}

	public int getItem4() {
		return item4;
	}

	public int getItem5() {
		return item5;
	}

	public int getItem6() {
		return item6;
	}

	public int getItemsPurchased() {
		return itemsPurchased;
	}

	public int getKillingSprees() {
		return killingSprees;
	}

	public int getLargestCriticalStrike() {
		return largestCriticalStrike;
	}

	public int getLargestKillingSpree() {
		return largestKillingSpree;
	}

	public int getLargestMultiKill() {
		return largestMultiKill;
	}

	public int getLegendaryItemsCreated() {
		return legendaryItemsCreated;
	}

	public int getLevel() {
		return level;
	}

	public int getMagicDamageDealtPlayer() {
		return magicDamageDealtPlayer;
	}

	public int getMagicDamageDealtToChampions() {
		return magicDamageDealtToChampions;
	}

	public int getMagicDamageTaken() {
		return magicDamageTaken;
	}

	public int getMinionsDenied() {
		return minionsDenied;
	}

	public int getMinionsKilled() {
		return minionsKilled;
	}

	public int getNeutralMinionsKilled() {
		return neutralMinionsKilled;
	}

	public int getNeutralMinionsKilledEnemyJungle() {
		return neutralMinionsKilledEnemyJungle;
	}

	public int getNeutralMinionsKilledYourJungle() {
		return neutralMinionsKilledYourJungle;
	}

	public int getNodeCapture() {
		return nodeCapture;
	}

	public int getNodeCaptureAssist() {
		return nodeCaptureAssist;
	}

	public int getNodeNeutralize() {
		return nodeNeutralize;
	}

	public int getNodeNeutralizeAssist() {
		return nodeNeutralizeAssist;
	}

	public int getNumDeaths() {
		return numDeaths;
	}

	public int getNumItemsBought() {
		return numItemsBought;
	}

	public int getObjectivePlayerScore() {
		return objectivePlayerScore;
	}

	public int getPentaKills() {
		return pentaKills;
	}

	public int getPhysicalDamageDealtPlayer() {
		return physicalDamageDealtPlayer;
	}

	public int getPhysicalDamageDealtToChampions() {
		return physicalDamageDealtToChampions;
	}

	public int getPhysicalDamageTaken() {
		return physicalDamageTaken;
	}

	public int getQuadraKills() {
		return quadraKills;
	}

	public int getSightWardsBought() {
		return sightWardsBought;
	}

	public int getSpell1Cast() {
		return spell1Cast;
	}

	public int getSpell2Cast() {
		return spell2Cast;
	}

	public int getSpell3Cast() {
		return spell3Cast;
	}

	public int getSpell4Cast() {
		return spell4Cast;
	}

	public int getSummonSpell1Cast() {
		return summonSpell1Cast;
	}

	public int getSummonSpell2Cast() {
		return summonSpell2Cast;
	}

	public int getSuperMonsterKilled() {
		return superMonsterKilled;
	}

	public int getTeam() {
		return team;
	}

	public int getTeamObjective() {
		return teamObjective;
	}

	public int getTimePlayed() {
		return timePlayed;
	}

	public int getTotalDamageDealt() {
		return totalDamageDealt;
	}

	public int getTotalDamageDealtToChampions() {
		return totalDamageDealtToChampions;
	}

	public int getTotalDamageTaken() {
		return totalDamageTaken;
	}

	public int getTotalHeal() {
		return totalHeal;
	}

	public int getTotalPlayerScore() {
		return totalPlayerScore;
	}

	public int getTotalScoreRank() {
		return totalScoreRank;
	}

	public int getTotalTimeCrowdControlDealt() {
		return totalTimeCrowdControlDealt;
	}

	public int getTotalUnitsHealed() {
		return totalUnitsHealed;
	}

	public int getTripleKills() {
		return tripleKills;
	}

	public int getTrueDamageDealtPlayer() {
		return trueDamageDealtPlayer;
	}

	public int getTrueDamageDealtToChampions() {
		return trueDamageDealtToChampions;
	}

	public int getTrueDamageTaken() {
		return trueDamageTaken;
	}

	public int getTurretsKilled() {
		return turretsKilled;
	}

	public int getUnrealKills() {
		return unrealKills;
	}

	public int getVictoryPointTotal() {
		return victoryPointTotal;
	}

	public int getVisionWardsBought() {
		return visionWardsBought;
	}

	public int getWardKilled() {
		return wardKilled;
	}

	public int getWardPlaced() {
		return wardPlaced;
	}

	public boolean isWin() {
		return win;
	}

	public boolean isNexusKilled() {
		return nexusKilled;
	}
}
