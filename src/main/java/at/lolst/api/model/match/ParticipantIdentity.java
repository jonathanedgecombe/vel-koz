package at.lolst.api.model.match;

/**
 * 
 * @author jonathan
 *
 */
public final class ParticipantIdentity {
	private final int participantId;
	private final Player player;

	public ParticipantIdentity(int participantId, Player player) {
		this.participantId = participantId;
		this.player = player;
	}

	public int getParticipantId() {
		return participantId;
	}

	public Player getPlayer() {
		return player;
	}
}
