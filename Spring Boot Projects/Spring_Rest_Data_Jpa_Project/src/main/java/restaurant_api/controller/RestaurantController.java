package restaurant_api.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import restaurant_api.entity.Restaurant;
import restaurant_api.exception.RestaurantNotFoundException;
import restaurant_api.service.RestaurantService;

@CrossOrigin
@RestController
public class RestaurantController {
	
	@Autowired
	private RestaurantService restaurantServiceRef;
	
	@GetMapping("/restaurants")
	public Collection<Restaurant> getAllRestaurants() {
		return restaurantServiceRef.getAllRestaurants();
	}
	
	@GetMapping("/restaurants/{restaurantId}")
	public Restaurant getOneRestaurant(@PathVariable Integer restaurantId) {
		Restaurant foundRestaurant = restaurantServiceRef.getOneRestaurant(restaurantId);
//		System.out.println("Found Restaurant is : "+foundRestaurant);
		if (foundRestaurant == null) {
			RestaurantNotFoundException rx = new RestaurantNotFoundException("Restaurant with given ID does not exist");
					throw rx;
		}
		return foundRestaurant;
	}
	
	@PostMapping("/restaurants")
	public void createRestaurant(@RequestBody Restaurant newRestaurant) {
		restaurantServiceRef.createRestaurant(newRestaurant);
	}
	
	@PutMapping("/restaurants")
	public void updateRestaurant(@RequestBody Restaurant modifiedRestaurant) {
		restaurantServiceRef.updateRestaurant(modifiedRestaurant);
	}
	
	@DeleteMapping("/restaurants/{restaurantId}")
	public void deleteRestaurant(@PathVariable Integer restaurantId) {
		restaurantServiceRef.deleteRestaurant(restaurantId);
	}
}







