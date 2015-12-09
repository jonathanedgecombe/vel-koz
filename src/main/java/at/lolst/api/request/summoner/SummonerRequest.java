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

public final class SummonerRequest extends Request<Map<String, Summoner>> {
	private final static Type TYPE = new TypeToken<Map<String, Summoner>>(){}.getType();

	private final List<Long> summonerIds;

	public SummonerRequest(Region region, Long... summonerIds) {
		this(region, null, null, summonerIds);
	}

	public SummonerRequest(Region region, Consumer<Result<Map<String, Summoner>>> onCompletion, Consumer<Exception> onError, Long... summonerIds) {
		super(region, onCompletion, onError);
		this.summonerIds = Arrays.asList(summonerIds);
	}

	public List<Long> getSummonerIds() {
		return summonerIds;
	}

	@Override
	public String getUrl() {
		return "/api/lol/" + region + "/v1.4/summoner/" + Util.join(summonerIds, ",");
	}

	@Override
	public Type getType() {
		return TYPE;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof SummonerRequest)) return false;
		SummonerRequest r = (SummonerRequest) o;
		return (r.region == region && r.summonerIds.equals(summonerIds));
	}

	@Override
	public int hashCode() {
		return (region.hashCode() + summonerIds.hashCode() * 46447);
	}

	public List<SummonerRequest> explode() {
		return summonerIds.stream().map(summonerId -> new SummonerRequest(region, onCompletion, onError, summonerId)).collect(Collectors.toList());
	}

	@Override
	public Optional<RequestAggregator<Map<String, Summoner>>> getAggregator() {
		return Optional.of(new SummonerRequestAggregator());
	}
}
