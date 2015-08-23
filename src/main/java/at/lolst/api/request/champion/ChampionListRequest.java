package at.lolst.api.request.champion;

import java.lang.reflect.Type;
import java.util.function.Consumer;

import com.google.gson.reflect.TypeToken;

import at.lolst.api.model.Region;
import at.lolst.api.model.data.champion.ChampionList;
import at.lolst.api.request.Request;

public final class ChampionListRequest extends Request<ChampionList> {
	private final static Type TYPE = new TypeToken<ChampionList>(){}.getType();

	private final boolean freeToPlay;

	public ChampionListRequest(Region region, Consumer<ChampionList> onCompletion, Consumer<Throwable> onError, boolean freeToPlay) {
		super(region, onCompletion, onError);
		this.freeToPlay = freeToPlay;
	}

	@Override
	public Type getType() {
		return TYPE;
	}

	@Override
	public String getUrl() {
		return "/api/lol/" + region + "/v1.2/champion?freeToPlay=" + freeToPlay;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof ChampionListRequest)) return false;
		ChampionListRequest r = (ChampionListRequest) o;
		return (r.region == region && r.freeToPlay == freeToPlay);
	}

	@Override
	public int hashCode() {
		return (int) (region.hashCode() * 46447 + (freeToPlay ? 23 : 7));
	}
}
