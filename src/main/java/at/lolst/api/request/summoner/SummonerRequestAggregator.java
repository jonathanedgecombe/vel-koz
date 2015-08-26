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

/**
 * 
 * @author jonathan
 *
 */
public class SummonerRequestAggregator extends RequestAggregator<Map<String, Summoner>> {
	@Override
	public synchronized Future aggregate(Request<Map<String, Summoner>> request, RequestDispatcher dispatcher, boolean wait) throws InterruptedException {
		Cache cache = dispatcher.getCache();

		BlockingDeque<Request<Map<String, Summoner>>> queue = new LinkedBlockingDeque<>();
		queue.addAll(request.explode());

		final List<Future> futures = new ArrayList<Future>();

		while (!queue.isEmpty()) {
			List<Long> summonerIds = new ArrayList<>();

			while (summonerIds.size() < 40 && !queue.isEmpty()) {
				SummonerRequest r = (SummonerRequest) queue.poll();

				synchronized (cache.getExecuting()) {
					if (cache.isExecuting(r)) {
						futures.add(cache.onExecute(r));
						continue;
					}
				}

				Optional<Map<String, Summoner>> result = dispatcher.getCache().check(r);

				if (result.isPresent()) {
					r.getOnCompletion().accept(result.get());
				} else {
					summonerIds.add(r.getSummonerIds().get(0));
				}
			}

			if (summonerIds.isEmpty()) continue;

			Future future = dispatcher.execute(new SummonerRequest(request.getRegion(), request.getOnCompletion(), request.getOnError(), summonerIds.toArray(new Long[0])), false, wait);
			futures.add(future);

			summonerIds.forEach(summonerId -> {
				synchronized (cache.getExecuting()) {
					cache.startExecuting(new SummonerRequest(request.getRegion(), request.getOnCompletion(), request.getOnError(), summonerId), future);
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
	public void cache(Request<Map<String, Summoner>> request, final Map<String, Summoner> result, Cache cache) {
		((SummonerRequest) request).explode().forEach(r -> {
			long summonerId = r.getSummonerIds().get(0);

			String key = Long.toString(summonerId);
			Map<String, Summoner> map = new HashMap<>();
			map.put(key, result.get(key));
			cache.cache(r, map, false);

			synchronized (cache.getExecuting()) {
				cache.finishExecuting(new SummonerRequest(request.getRegion(), request.getOnCompletion(), request.getOnError(), summonerId), map);
			}
		});
	}
}