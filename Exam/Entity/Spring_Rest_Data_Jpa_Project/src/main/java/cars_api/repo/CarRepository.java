package cars_api.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import cars_api.entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer>{

    List<Car> findByPriceBetween(int minPrice, int maxPrice);
 }
