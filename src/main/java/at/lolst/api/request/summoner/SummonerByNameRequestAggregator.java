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
import at.lolst.api.request.Result;

/**
 * 
 * @author jonathan
 *
 */
public class SummonerByNameRequestAggregator extends RequestAggregator<Map<String, Summoner>> {
	@Override
	public synchronized Future aggregate(Request<Map<String, Summoner>> request, RequestDispatcher dispatcher, boolean wait) throws InterruptedException {
		Cache cache = dispatcher.getCache();

		BlockingDeque<Request<Map<String, Summoner>>> queue = new LinkedBlockingDeque<>();
		queue.addAll(request.explode());

		final List<Future> futures = new ArrayList<Future>();

		while (!queue.isEmpty()) {
			List<String> summonerNames = new ArrayList<>();

			while (summonerNames.size() < 40 && !queue.isEmpty()) {
				SummonerByNameRequest r = (SummonerByNameRequest) queue.poll();

				synchronized (cache.getExecuting()) {
					if (cache.isExecuting(r)) {
						futures.add(cache.onExecute(r));
						continue;
					}
				}

				Optional<Result<Map<String, Summoner>>> result = dispatcher.getCache().check(r);

				if (result.isPresent()) {
					r.getOnCompletion().accept(result.get());
				} else {
					summonerNames.add(r.getSummonerNames().get(0));
				}
			}

			if (summonerNames.isEmpty()) continue;

			Future future = dispatcher.execute(new SummonerByNameRequest(request.getRegion(), request.getOnCompletion(), request.getOnError(), summonerNames.toArray(new String[0])), false, wait);
			futures.add(future);

			summonerNames.forEach(summonerName -> {
				synchronized (cache.getExecuting()) {
					cache.startExecuting(new SummonerByNameRequest(request.getRegion(), request.getOnCompletion(), request.getOnError(), summonerName), future);
				}
			});
		}

		return new Future() {
			@Override
			public void await() throws InterruptedException {
				for (Future future : futures) future.await();
			}
		};
	}

	@Override
	public void cache(Request<Map<String, Summoner>> request, final Result<Map<String, Summoner>> result, Cache cache) {
		((SummonerByNameRequest) request).explode().forEach(r -> {
			String summonerName = r.getSummonerNames().get(0);

			String key = summonerName.toLowerCase().replace(" ", "");
			Map<String, Summoner> map = new HashMap<>();
			map.put(key, result.getValue().get(key));
			Result<Map<String, Summoner>> newResult = new Result<>(result.getJson(), map);
			cache.cache(r, newResult, false);

			synchronized (cache.getExecuting()) {
				cache.finishExecuting(new SummonerByNameRequest(request.getRegion(), request.getOnCompletion(), request.getOnError(), summonerName), newResult);
			}
		});
	}
}