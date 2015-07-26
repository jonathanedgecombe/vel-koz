package at.lolst.api.model.match;

/**
 * 
 * @author jonathan
 *
 */
public final class ParticipantTimelineData {
	private final double tenToTwenty, thirtyToEnd, twentyToThirty, zeroToTen;

	public ParticipantTimelineData(double zeroToTen, double tenToTwenty, double twentyToThirty, double thirtyToEnd) {
		this.zeroToTen = zeroToTen;
		this.tenToTwenty = tenToTwenty;
		this.twentyToThirty = twentyToThirty;
		this.thirtyToEnd = thirtyToEnd;
	}

	public double getZeroToTen() {
		return zeroToTen;
	}

	public double getTenToTwenty() {
		return tenToTwenty;
	}

	public double getTwentyToThirty() {
		return twentyToThirty;
	}

	public double getThirtyToEnd() {
		return thirtyToEnd;
	}
}
