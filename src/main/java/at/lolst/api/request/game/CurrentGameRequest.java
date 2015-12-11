package at.lolst.api.request.game;

import java.lang.reflect.Type;
import java.util.function.Consumer;

import com.google.gson.reflect.TypeToken;

import at.lolst.api.model.Region;
import at.lolst.api.model.currentgame.CurrentGameInfo;
import at.lolst.api.request.Request;
import at.lolst.api.request.RequestException;
import at.lolst.api.request.Result;

public final class CurrentGameRequest extends Request<CurrentGameInfo> {
	private final static Type TYPE = new TypeToken<CurrentGameInfo>(){}.getType();

	private final long summonerId;

	public CurrentGameRequest(Region region, long summonerId) {
		this(region, null, null, summonerId);
	}

	public CurrentGameRequest(Region region, Consumer<Result<CurrentGameInfo>> onCompletion, Consumer<RequestException> onError, long summonerId) {
		super(region, onCompletion, onError);
		this.summonerId = summonerId;
	}

	@Override
	public Type getType() {
		return TYPE;
	}

	@Override
	public String getUrl() {
		return "/observer-mode/rest/consumer/getSpectatorGameInfo/" + region.getPlatformId() + "/" + summonerId;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof CurrentGameRequest)) return false;
		CurrentGameRequest r = (CurrentGameRequest) o;
		return (r.region == region && r.summonerId == summonerId);
	}

	@Override
	public int hashCode() {
		return (int) (region.hashCode() + summonerId * 46447);
	}
}
