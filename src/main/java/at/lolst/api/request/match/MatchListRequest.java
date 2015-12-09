package at.lolst.api.request.match;

import java.lang.reflect.Type;
import java.util.function.Consumer;

import com.google.gson.reflect.TypeToken;

import at.lolst.api.model.Region;
import at.lolst.api.model.match.history.MatchList;
import at.lolst.api.request.Request;
import at.lolst.api.request.Result;

public final class MatchListRequest extends Request<MatchList> {
	private final static Type TYPE = new TypeToken<MatchList>(){}.getType();

	private final long summonerId;
	private final long beginTime;

	public MatchListRequest(Region region, long summonerId, long beginTime) {
		this(region, null, null, summonerId, beginTime);
	}

	public MatchListRequest(Region region, Consumer<Result<MatchList>> onCompletion, Consumer<Exception> onError, long summonerId, long beginTime) {
		super(region, onCompletion, onError);
		this.summonerId = summonerId;
		this.beginTime = beginTime;
	}

	@Override
	public Type getType() {
		return TYPE;
	}

	@Override
	public String getUrl() {
		return "/api/lol/" + region + "/v2.2/matchlist/by-summoner/" + summonerId + "?beginTime=" + beginTime;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof MatchListRequest)) return false;
		MatchListRequest r = (MatchListRequest) o;
		return (r.region == region && r.summonerId == summonerId && r.beginTime == beginTime);
	}

	@Override
	public int hashCode() {
		return (int) (region.hashCode() + summonerId * 46447 + beginTime * 23 + 7);
	}
}
