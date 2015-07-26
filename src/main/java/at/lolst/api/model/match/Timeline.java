package at.lolst.api.model.match;

import java.util.List;

/**
 * 
 * @author jonathan
 *
 */
public final class Timeline {
	private final long frameInterval;
	private final List<Frame> frames;

	public Timeline(long frameInterval, List<Frame> frames) {
		this.frameInterval = frameInterval;
		this.frames = frames;
	}

	public long getFrameInterval() {
		return frameInterval;
	}

	public List<Frame> getFrames() {
		return frames;
	}
}
