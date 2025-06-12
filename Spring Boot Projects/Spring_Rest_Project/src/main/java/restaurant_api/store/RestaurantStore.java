package restaurant_api.store;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import restaurant_api.bean.Restaurant;

public class RestaurantStore {
	private static Map<Integer, Restaurant> allRestaurants;
	static {
		allRestaurants = new HashMap<>();
		Restaurant r1 = new Restaurant(101,"Punjab Grill","Punjabi",10);
		Restaurant r2 = new Restaurant(102,"Mcdonals","American",10);
		Restaurant r3 = new Restaurant(103,"Flavours of China","Chinese",10);
		allRestaurants.put(r1.getRestaurantId(),r1);
		allRestaurants.put(r2.getRestaurantId(),r2);
		allRestaurants.put(r3.getRestaurantId(),r3);
	}
	
	public static Collection<Restaurant> getAll(){
		Collection<Restaurant> allAvailableRestaurants = allRestaurants.values();
		return allAvailableRestaurants;
	}
	
	public static Restaurant getOne(Integer restaurantId){
		return allRestaurants.get(restaurantId);
	}
	
	public static void create(Restaurant newRestaurant){
		allRestaurants.put(newRestaurant.getRestaurantId(), newRestaurant);
	}
}
















