package restaurant_api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import restaurant_api.entity.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer>{
	
}
