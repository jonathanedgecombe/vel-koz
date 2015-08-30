package at.lolst.api.request.match;

import java.lang.reflect.Type;
import java.util.function.Consumer;

import com.google.gson.reflect.TypeToken;

import at.lolst.api.model.Region;
import at.lolst.api.model.match.Match;
import at.lolst.api.request.Request;
import at.lolst.api.request.Result;

public final class MatchRequest extends Request<Match> {
	private final static Type TYPE = new TypeToken<Match>(){}.getType();

	private final long matchId;
	private final boolean includeTimeline;

	public MatchRequest(Region region, Consumer<Result<Match>> onCompletion, Consumer<Throwable> onError, long matchId, boolean includeTimeline) {
		super(region, onCompletion, onError);
		this.matchId = matchId;
		this.includeTimeline = includeTimeline;
	}

	@Override
	public Type getType() {
		return TYPE;
	}

	@Override
	public String getUrl() {
		return "/api/lol/" + region + "/v2.2/match/" + matchId + "?includeTimeline=" + includeTimeline;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof MatchRequest)) return false;
		MatchRequest r = (MatchRequest) o;
		return (r.region == region && r.matchId == matchId && r.includeTimeline == includeTimeline);
	}

	@Override
	public int hashCode() {
		return (int) (region.hashCode() + matchId * 46447 + (includeTimeline ? 23 : 7));
	}
}
