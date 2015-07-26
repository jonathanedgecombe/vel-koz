Vel-koz
=======

Vel-koz is a wrapper for the Riot Games League of Legends API designed for high throughput asynchronous requests.

Example Use
-----------

~~~
APIConnection connection = new APIConnection("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx", new Config(65536));

Future f = connection.execute(new SummonerRequest(
    Region.EUW, 
    result -> result.values().forEach(summoner -> System.out.println(summoner.getId() + ": " + summoner.getName())), 
    error -> error.printStackTrace(), 
    27966968L, 46768456L, 27665779L, 50499923L, 27695267L
));

System.out.println("before wait on future");

f.await();

System.out.println("after wait on future");
~~~
