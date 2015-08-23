package at.lolst.api.request.match;

import java.lang.reflect.Type;
import java.util.function.Consumer;

import com.google.gson.reflect.TypeToken;

import at.lolst.api.model.Region;
import at.lolst.api.model.match.history.MatchList;
import at.lolst.api.request.Request;

public final class MatchListRequest extends Request<MatchList> {
	private final static Type TYPE = new TypeToken<MatchList>(){}.getType();

	private final long summonerId;
	private final int beginIndex, endIndex;

	public MatchListRequest(Region region, Consumer<MatchList> onCompletion, Consumer<Throwable> onError, long summonerId, int beginIndex, int endIndex) {
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
		return "/api/lol/" + region + "/v2.2/matchlist/by-summoner/" + summonerId + "?beginIndex=" + beginIndex + "&endIndex=" + endIndex;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof MatchListRequest)) return false;
		MatchListRequest r = (MatchListRequest) o;
		return (r.region == region && r.summonerId == summonerId && r.beginIndex == beginIndex && r.endIndex == endIndex);
	}

	@Override
	public int hashCode() {
		return (int) (region.hashCode() + summonerId * 46447 + beginIndex * 23 + endIndex * 7);
	}
}
