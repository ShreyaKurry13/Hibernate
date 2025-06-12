package restaurant_api.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import restaurant_api.bean.Restaurant;
import restaurant_api.repo.RestaurantRepository;
import restaurant_api.store.RestaurantStore;

@Service
public class RestaurantService {
	
	@Autowired
	private RestaurantRepository restaurantRespositoryRef;
	public Collection<Restaurant> getAllRestaurants(){
	    Collection<Restaurant> allrestaurants =	restaurantRespositoryRef.getAllRestaurants();
	    return allrestaurants;
	}
	
	public Restaurant getOneRestaurant(Integer restaurantId){
		return restaurantRespositoryRef.getOneRestaurant(restaurantId);
	}
	
	public void createRestaurant(Restaurant restaurantObject){
		restaurantRespositoryRef.createRestaurant(restaurantObject);
	}
}
