package restaurant_api.repo;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import restaurant_api.bean.Restaurant;
import restaurant_api.store.RestaurantStore;

@Repository
public class RestaurantRepository {
	
	public Collection<Restaurant> getAllRestaurants(){
		Collection<Restaurant> allRestaurants = RestaurantStore.getAll();
		return allRestaurants;
	}
	
	public Restaurant getOneRestaurant(Integer restaurantId){
		return RestaurantStore.getOne(restaurantId);
	}
	
	public static void createRestaurant(Restaurant restaurantObject){
		RestaurantStore.create(restaurantObject);
	}
}
