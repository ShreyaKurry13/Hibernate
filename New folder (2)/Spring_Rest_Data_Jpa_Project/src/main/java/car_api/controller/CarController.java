package car_api.controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import car_api.entity.Car;
import car_api.exception.CarNotFoundException;
import car_api.service.CarService;

@RestController
public class CarController {

	
	@Autowired
	private CarService carServiceRef;
	
	
	
	@GetMapping("/cars")
	public Collection<Car> getAllCars(){
		return carServiceRef.getAllCars();
	}
	
	
	@GetMapping("/cars/{carId}")
	public Car getOneCar(@PathVariable Integer carId) {
		
		Car foundCar = carServiceRef.getOneCar(carId);
		
		if (foundCar == null) {
		
			CarNotFoundException rx = new CarNotFoundException("Car with given Id does not Exists...");
			throw rx;
		}
		
		return foundCar;
	}
	
	@GetMapping("/cars/{minPrice}/{maxPrice}")
    public List<Car> getByPriceRange(@PathVariable int minPrice,@PathVariable int maxPrice) {
        return carServiceRef.getByPriceRange(minPrice, maxPrice);
    }
    
	@GetMapping("/cars/make-year/{make}/{year}")
    public List<Car> findByMakeAndYear(@PathVariable String make,@PathVariable int year){
    	
    	return carServiceRef.findByMakeAndYear(make, year);
    }
    
    
	@GetMapping("/cars/make/{make}")
    public Optional<Car> findByMake(@PathVariable String make){
    	return carServiceRef.findByMake(make);
    }
	
    
    @PostMapping("/cars")
    public void addCar(@RequestBody Car newCar) {
    	carServiceRef.addCar(newCar);
    }
    
    
    @PutMapping("/cars")
	public void updateCar(@RequestBody Car modifiedCar) {
		carServiceRef.updateCar(modifiedCar);
	}
	
	@DeleteMapping("/cars/{carId}")
	private void deleteOneCar(@PathVariable Integer carId) {
		
		carServiceRef.deleteOneCar(carId);
		
	}
    
	
}
