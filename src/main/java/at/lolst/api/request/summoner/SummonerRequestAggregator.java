package at.lolst.api.request.summoner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;


import at.lolst.api.Future;
import at.lolst.api.model.summoner.Summoner;
import at.lolst.api.request.Cache;
import at.lolst.api.request.Request;
import at.lolst.api.request.RequestAggregator;
import at.lolst.api.request.RequestDispatcher;
import at.lolst.api.request.RequestException;
import at.lolst.api.request.Result;

public class SummonerRequestAggregator extends RequestAggregator<Map<String, Summoner>> {
	@Override
	public synchronized Future<Map<String, Summoner>> aggregate(Request<Map<String, Summoner>> request, RequestDispatcher dispatcher, boolean wait) throws InterruptedException {
		BlockingDeque<Request<Map<String, Summoner>>> queue = new LinkedBlockingDeque<>();
		queue.addAll(request.explode());

		final List<Future<Map<String, Summoner>>> futures = new ArrayList<Future<Map<String, Summoner>>>();

		while (!queue.isEmpty()) {
			List<Long> summonerIds = new ArrayList<>();

			while (summonerIds.size() < 40 && !queue.isEmpty()) {
				SummonerRequest r = (SummonerRequest) queue.poll();
				Optional<Result<Map<String, Summoner>>> result = dispatcher.getCache().check(r);

				if (result.isPresent()) {
					r.accept(result.get());
				} else {
					summonerIds.add(r.getSummonerIds().get(0));
				}
			}

			if (summonerIds.isEmpty()) continue;

			Future<Map<String, Summoner>> future = dispatcher.execute(new SummonerRequest(request.getRegion(), request.getOnCompletion(), request.getOnError(), summonerIds.toArray(new Long[0])), false, wait);
			futures.add(future);
		}

		return new Future<Map<String, Summoner>>() {
			@Override
			public void await() throws InterruptedException {
				for (Future<Map<String, Summoner>> future : futures) future.await();
			}

			@Override
			public Optional<Result<Map<String, Summoner>>> getResult() {
				Map<String, Summoner> map = new HashMap<>();

				for (Future<Map<String, Summoner>> future : futures) {
					Optional<Result<Map<String, Summoner>>> result = future.getResult();
					if (result.isPresent()) {
						map.putAll(result.get().getValue());
					}
				}

				return Optional.of(new Result<>(null, map, request, dispatcher.getCache()));
			}

			@Override
			public Map<Request<Map<String, Summoner>>, RequestException> getExceptions() {
				Map<Request<Map<String, Summoner>>, RequestException> map = new HashMap<>();

				for (Future<Map<String, Summoner>> future : futures) {
					map.putAll(future.getExceptions());
				}

				return map;
			}
		};
	}

	@Override
	public void cache(Request<Map<String, Summoner>> request, final Result<Map<String, Summoner>> result, Cache cache, long timeout) {
		((SummonerRequest) request).explode().forEach(r -> {
			long summonerId = r.getSummonerIds().get(0);

			String key = Long.toString(summonerId);
			Map<String, Summoner> map = new HashMap<>();
			map.put(key, result.getValue().get(key));
			Result<Map<String, Summoner>> newResult = new Result<>(result.getJson(), map, request, cache);
			cache.cache(r, newResult, false, timeout);
		});
	}
}