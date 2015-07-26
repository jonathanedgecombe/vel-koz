package at.lolst.api.model.match;

import java.util.List;

/**
 * 
 * @author jonathan
 *
 */
public final class Event {
	private final String ascendedType, buildingType, eventType, laneType, levelUpType, monsterType, pointCaptured, towerType, wardType;
	private final List<Integer> assistingParticipantIds;
	private final int creatorId, itemAfter, itemBefore, itemId, killerId, participantId, skillSlot, teamId, victimId;
	private final Position position;
	private final long timestamp;

	public Event(String ascendedType, String buidlingType, String eventType, String laneType, String levelUpType, String monsterType, String pointCaptured, String towerType, String wardType, List<Integer> assistingParticipantIds, int creatorId, int itemAfter, int itemBefore, int itemId, int killerId, int participantId, int skillSlot, int teamId, int victimId, Position position, long timestamp) {
		this.ascendedType = ascendedType;
		this.buildingType = buidlingType;
		this.eventType = eventType;
		this.laneType = laneType;
		this.levelUpType = levelUpType;
		this.monsterType = monsterType;
		this.pointCaptured = pointCaptured;
		this.towerType = towerType;
		this.wardType = wardType;
		this.assistingParticipantIds = assistingParticipantIds;
		this.creatorId = creatorId;
		this.itemAfter = itemAfter;
		this.itemBefore = itemBefore;
		this.itemId = itemId;
		this.killerId = killerId;
		this.participantId = participantId;
		this.skillSlot = skillSlot;
		this.teamId = teamId;
		this.victimId = victimId;
		this.position = position;
		this.timestamp = timestamp;
	}

	public String getAscendedType() {
		return ascendedType;
	}

	public String getBuildingType() {
		return buildingType;
	}

	public String getEventType() {
		return eventType;
	}

	public String getLaneType() {
		return laneType;
	}

	public String getLevelUpType() {
		return levelUpType;
	}

	public String getMonsterType() {
		return monsterType;
	}

	public String getPointCaptured() {
		return pointCaptured;
	}

	public String getTowerType() {
		return towerType;
	}

	public String getWardType() {
		return wardType;
	}

	public List<Integer> getAssistingParticipantIds() {
		return assistingParticipantIds;
	}

	public int getCreatorId() {
		return creatorId;
	}

	public int getItemAfter() {
		return itemAfter;
	}

	public int getItemBefore() {
		return itemBefore;
	}

	public int getItemId() {
		return itemId;
	}

	public int getKillerId() {
		return killerId;
	}

	public int getParticipantId() {
		return participantId;
	}

	public int getSkillSlot() {
		return skillSlot;
	}

	public int getTeamId() {
		return teamId;
	}

	public int getVictimId() {
		return victimId;
	}

	public Position getPosition() {
		return position;
	}

	public long getTimestamp() {
		return timestamp;
	}
}
