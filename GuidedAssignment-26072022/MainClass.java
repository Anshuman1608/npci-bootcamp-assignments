package practice;

import java.util.HashMap;
import java.util.Map;

public class MainClass {
	public static void main(String[] args) {
		Map<String , Movie> movieMap = new HashMap<String,Movie>();
		
		movieMap.put("Rajkumar Hirani", new Movie("3 idiots","Rajkumar Hirani","2 Hours 30 mins",2015));
		movieMap.put("Russo Brothers", new Movie("The Avenegers", "Russo Brothers","2 Hours 15 minutes", 2012));
		movieMap.put("Sajid Nadiadwala", new Movie("Heropanti","Sajid Nadiadwala","1 hours 57 minutes",2015));
		movieMap.put("John Favreau",new Movie("Iron Man","John Favreau","2 Hours 25 minutes", 2008));
		movieMap.put("Russo Brothers", new Movie("Captain America - Winter Soldier","Russo Brothers","2 Hours 30 Minutes",2014));
		movieMap.put("Peyton Reed", new Movie("Ant-Man","Peyton Reed","1 Hours 50 Minutes",2015));
		movieMap.put("Scott Derrik", new Movie("Doctor Strange","Scott Derrikson","2 hours 10 Minutes",2015));
		movieMap.put("Taika Watiti", new Movie("Thor Ragnarok","Taika Watiti", "2 Hours 45 Minutes",2017));
		movieMap.put("Cate Shortland", new Movie("Black Widow", "Cate Shortland","2 Hours 5 Minutes", 2021));
		movieMap.put("John Watts", new Movie("Spiderman No Way Home","John Watts","3 hours",2021));
		
		
		for(Map.Entry<String,Movie> mapdata : movieMap.entrySet())
		{
			System.out.println(mapdata);
		}
	}
}
