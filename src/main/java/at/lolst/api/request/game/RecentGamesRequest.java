package at.lolst.api.request.game;

import java.lang.reflect.Type;
import java.util.function.Consumer;

import com.google.gson.reflect.TypeToken;

import at.lolst.api.model.Region;
import at.lolst.api.model.game.RecentGames;
import at.lolst.api.request.Request;

public final class RecentGamesRequest extends Request<RecentGames> {
	private final static Type TYPE = new TypeToken<RecentGames>(){}.getType();

	private final long summonerId;

	public RecentGamesRequest(Region region, Consumer<RecentGames> onCompletion, Consumer<Throwable> onError, long summonerId) {
		super(region, onCompletion, onError);
		this.summonerId = summonerId;
	}

	@Override
	public Type getType() {
		return TYPE;
	}

	@Override
	public String getUrl() {
		return "/api/lol/" + region + "/v1.3/game/by-summoner/" + summonerId;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof RecentGamesRequest)) return false;
		RecentGamesRequest r = (RecentGamesRequest) o;
		return (r.region == region && r.summonerId == summonerId);
	}

	@Override
	public int hashCode() {
		return (int) (region.hashCode() + summonerId * 46447);
	}
}
