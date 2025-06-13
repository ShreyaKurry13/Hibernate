package restaurant_api.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import restaurant_api.entity.Restaurant;
import restaurant_api.repo.RestaurantRepository;

@Service
public class RestaurantService {
	
	@Autowired
	private RestaurantRepository restaurantRepositoryRef;

	public Collection<Restaurant> getAllRestaurants(){
		return restaurantRepositoryRef.findAll();
	}
	
	public Restaurant getOneRestaurant(Integer restaurantId) {
		Restaurant foundRestaurant = null;
		Optional<Restaurant> opt = 	restaurantRepositoryRef.findById(restaurantId);
		if (opt.isPresent()) {
			foundRestaurant = opt.get();
		}
		return foundRestaurant;
	}
	
	public void createRestaurant(Restaurant newRestaurant) {
		restaurantRepositoryRef.save(newRestaurant);
	}
	
	public void updateRestaurant(Restaurant modifiedRestaurant) {
		restaurantRepositoryRef.save(modifiedRestaurant);
	}
	
	public void deleteRestaurant(Integer restaurantId) {
		restaurantRepositoryRef.deleteById(restaurantId);
	}
}
