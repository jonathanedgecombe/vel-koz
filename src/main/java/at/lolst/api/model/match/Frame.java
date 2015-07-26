package at.lolst.api.model.match;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author jonathan
 *
 */
public final class Frame {
	private final List<Event> events;
	private final Map<String, ParticipantFrame> participantFrames;
	private final long timestamp;

	public Frame(List<Event> events, Map<String, ParticipantFrame> participantFrames, long timestamp) {
		this.events = events;
		this.participantFrames = participantFrames;
		this.timestamp = timestamp;
	}

	public List<Event> getEvents() {
		return events;
	}

	public Map<String, ParticipantFrame> getParticipantFrames() {
		return participantFrames;
	}

	public long getTimestamp() {
		return timestamp;
	}
}
