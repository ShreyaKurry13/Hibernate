package cars_api.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cars_api.entity.Car;
import cars_api.exception.CarNotFoundException;
import cars_api.repo.CarRepository;

@Service
public class CarService {
	
	@Autowired
	private CarRepository carRepositoryRef;
	
	public Collection<Car> getAllCars() {
		return carRepositoryRef.findAll();
	}
	
	public Car getOneCar(Integer carId) {
		Car foundCar = null;
		Optional<Car> opt = carRepositoryRef.findById(carId);
		if (opt.isPresent()) {
			foundCar = opt.get();
		}
		return foundCar;
	}
	
	//get cars by minprice and maxprice
	public List<Car> getByPriceRange(int minPrice, int maxPrice) {
        return carRepositoryRef.findByPriceBetween(minPrice,maxPrice);
    }
	
	//add car
	public void addCar(Car newCar) {
    	carRepositoryRef.save(newCar);
    }

	public void updateCar(Car modifiedCar) {
		carRepositoryRef.save(modifiedCar);
	}
	
	public void deleteCar(Integer carId) {
		carRepositoryRef.deleteById(carId);
	}
}