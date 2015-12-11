Vel-koz
=======

Vel-koz is a wrapper for the Riot Games League of Legends API designed for high throughput asynchronous requests.

Example Use
-----------

~~~
APIConnection connection = new APIConnection(
	"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx", 
	new ConfigBuilder().setCacheSize(1024).build(),
	new RateLimit(500, 10, TimeUnit.MINUTES), 
	new RateLimit(10, 10, TimeUnit.SECONDS)
);

Future<Map<String, Summoner>> future = connection.execute(new SummonerByNameRequest(Region.EUW, "Jonneh", "NOT BAIT"));
future.await();

if (future.getResult().isPresent()) {
	future.getResult().get().cache(2, TimeUnit.HOURS);

	CurrentGameRequest[] requests = future.get().values().stream()
		.map(summoner -> new CurrentGameRequest(
			Region.EUW, 
			result -> System.out.println(result), 
			error -> System.out.println(error), 
			summoner.getId()))
		.collect(Collectors.toList()).toArray(new CurrentGameRequest[0]);

	FutureList<CurrentGameInfo> futures = connection.execute(requests);
	futures.await();
} else {
	future.getException().get().printStackTrace();
}

connection.close();
~~~
