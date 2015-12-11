package at.lolst.api.request.match;

import java.lang.reflect.Type;
import java.util.function.Consumer;

import com.google.gson.reflect.TypeToken;

import at.lolst.api.model.Region;
import at.lolst.api.model.match.history.MatchHistory;
import at.lolst.api.request.Request;
import at.lolst.api.request.RequestException;
import at.lolst.api.request.Result;

public final class MatchHistoryRequest extends Request<MatchHistory> {
	private final static Type TYPE = new TypeToken<MatchHistory>(){}.getType();

	private final long summonerId;
	private final int beginIndex, endIndex;

	public MatchHistoryRequest(Region region, long summonerId, int beginIndex, int endIndex) {
		this(region, null, null, summonerId, beginIndex, endIndex);
	}

	public MatchHistoryRequest(Region region, Consumer<Result<MatchHistory>> onCompletion, Consumer<RequestException> onError, long summonerId, int beginIndex, int endIndex) {
		super(region, onCompletion, onError);
		this.summonerId = summonerId;
		this.beginIndex = beginIndex;
		this.endIndex = endIndex;
	}

	@Override
	public Type getType() {
		return TYPE;
	}

	@Override
	public String getUrl() {
		return "/api/lol/" + region + "/v2.2/matchhistory/" + summonerId + "?beginIndex=" + beginIndex + "&endIndex=" + endIndex;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof MatchHistoryRequest)) return false;
		MatchHistoryRequest r = (MatchHistoryRequest) o;
		return (r.region == region && r.summonerId == summonerId && r.beginIndex == beginIndex && r.endIndex == endIndex);
	}

	@Override
	public int hashCode() {
		return (int) (region.hashCode() + summonerId * 46447 + beginIndex * 23 + endIndex * 7);
	}
}
