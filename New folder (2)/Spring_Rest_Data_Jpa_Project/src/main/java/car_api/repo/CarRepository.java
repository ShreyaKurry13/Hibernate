package car_api.repo;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import car_api.entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer>{
	
	Optional<Car> findByMake(String make);

    List<Car> findByMakeAndYear(String make, int year);

    List<Car> findByPriceBetween(int minPrice, int maxPrice);

}
