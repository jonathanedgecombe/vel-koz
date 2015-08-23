package at.lolst.api.request.match;

import java.lang.reflect.Type;
import java.util.function.Consumer;

import com.google.gson.reflect.TypeToken;

import at.lolst.api.model.Region;
import at.lolst.api.model.match.history.MatchHistory;
import at.lolst.api.request.Request;

public final class MatchHistoryRequest extends Request<MatchHistory> {
	private final static Type TYPE = new TypeToken<MatchHistory>(){}.getType();

	private final long summonerId;

	public MatchHistoryRequest(Region region, Consumer<MatchHistory> onCompletion, Consumer<Throwable> onError, long summonerId) {
		super(region, onCompletion, onError);
		this.summonerId = summonerId;
	}

	@Override
	public Type getType() {
		return TYPE;
	}

	@Override
	public String getUrl() {
		return "/api/lol/" + region + "/v2.2/matchhistory/" + summonerId;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof MatchHistoryRequest)) return false;
		MatchHistoryRequest r = (MatchHistoryRequest) o;
		return (r.region == region && r.summonerId == summonerId);
	}

	@Override
	public int hashCode() {
		return (int) (region.hashCode() + summonerId * 46447);
	}
}
