package restaurant_api.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import restaurant_api.bean.Restaurant;
import restaurant_api.service.RestaurantService;
import restaurant_api.store.RestaurantStore;

@RestController
public class RestaurantController {
	
	@Autowired
	private RestaurantService restaurantServiceRef;
	
	@GetMapping("/restaurants")
	public Collection<Restaurant> getAllRestaurants(){
		return restaurantServiceRef.getAllRestaurants();
	}
	
	@GetMapping("/restaurants/{ID}")
	public Restaurant getOneRestaurant(@PathVariable("ID") Integer restaurantId){
		Restaurant foundRestaurant = restaurantServiceRef.getOneRestaurant(restaurantId);
		return foundRestaurant;
	}
	
	@PostMapping("/restaurants")
	public void createRestaurant(@RequestBody Restaurant restaurantObject) {
		System.out.println("Recieved Restaurant ==> " + restaurantObject);
		restaurantServiceRef.createRestaurant(restaurantObject);
	}
}


