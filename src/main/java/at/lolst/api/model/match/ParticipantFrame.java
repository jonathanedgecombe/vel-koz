package at.lolst.api.model.match;

public final class ParticipantFrame {
	private final int currentGold, jungleMinionsKilled, level, minionsKilled, participantId, totalGold, xp;
	private final Position position;

	public ParticipantFrame(int currentGold, int jungleMinionsKilled, int level, int minionsKilled, int participantId, Position position, int totalGold, int xp) {
		this.currentGold = currentGold;
		this.jungleMinionsKilled = jungleMinionsKilled;
		this.level = level;
		this.minionsKilled = minionsKilled;
		this.participantId = participantId;
		this.position = position;
		this.totalGold = totalGold;
		this.xp = xp;
	}

	public int getCurrentGold() {
		return currentGold;
	}

	public int getJungleMinionsKilled() {
		return jungleMinionsKilled;
	}

	public int getLevel() {
		return level;
	}

	public int getMinionsKilled() {
		return minionsKilled;
	}

	public int getParticipantId() {
		return participantId;
	}

	public int getTotalGold() {
		return totalGold;
	}

	public int getXp() {
		return xp;
	}

	public Position getPosition() {
		return position;
	}
}
