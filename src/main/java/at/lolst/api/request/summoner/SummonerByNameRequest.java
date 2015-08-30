package at.lolst.api.request.summoner;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import com.google.gson.reflect.TypeToken;

import at.lolst.api.Util;
import at.lolst.api.model.Region;
import at.lolst.api.model.summoner.Summoner;
import at.lolst.api.request.Request;
import at.lolst.api.request.RequestAggregator;
import at.lolst.api.request.Result;

/**
 * 
 * @author jonathan
 *
 */
public final class SummonerByNameRequest extends Request<Map<String, Summoner>> {
	private final static Type TYPE = new TypeToken<Map<String, Summoner>>(){}.getType();

	private final List<String> summonerNames;

	public SummonerByNameRequest(Region region, Consumer<Result<Map<String, Summoner>>> onCompletion, Consumer<Throwable> onError, String... summonerNames) {
		super(region, onCompletion, onError);
		this.summonerNames = Arrays.asList(summonerNames);
	}

	public List<String> getSummonerNames() {
		return summonerNames;
	}

	@Override
	public String getUrl() {
		return "/api/lol/" + region + "/v1.4/summoner/by-name/" + Util.join(summonerNames, ",");
	}

	@Override
	public Type getType() {
		return TYPE;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof SummonerByNameRequest)) return false;
		SummonerByNameRequest r = (SummonerByNameRequest) o;
		return (r.region == region && r.summonerNames.equals(summonerNames));
	}

	@Override
	public int hashCode() {
		return (region.hashCode() + summonerNames.hashCode() * 46447);
	}

	public List<SummonerByNameRequest> explode() {
		return summonerNames.stream().map(summonerId -> new SummonerByNameRequest(region, onCompletion, onError, summonerId)).collect(Collectors.toList());
	}

	@Override
	public Optional<RequestAggregator<Map<String, Summoner>>> getAggregator() {
		return Optional.of(new SummonerByNameRequestAggregator());
	}
}
