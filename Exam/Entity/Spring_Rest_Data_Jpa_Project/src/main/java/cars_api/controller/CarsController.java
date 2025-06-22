package cars_api.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cars_api.entity.Car;
import cars_api.exception.CarNotFoundException;
import cars_api.service.CarService;

@CrossOrigin
@RestController
public class CarsController {
	
	@Autowired
	private CarService carServiceRef;
	
	@GetMapping("/cars-api")
	public Collection<Car> getAllCars(){
		return carServiceRef.getAllCars();
	}
	
	@GetMapping("/cars-api/{carId}")
	public Car getOneCar(@PathVariable Integer carId){
		Car foundCar = carServiceRef.getOneCar(carId);
		if (foundCar == null) {
			CarNotFoundException rx = new CarNotFoundException("Car with given Id does not Exists...");
			throw rx;
		}
		return foundCar;
	}
	
	@GetMapping("/cars-api/{minPrice}/{maxPrice}")
    public List<Car> getByPriceRange(@PathVariable int minPrice,@PathVariable int maxPrice) {
        return carServiceRef.getByPriceRange(minPrice, maxPrice);
    }
	
	@PostMapping("/cars-api")
    public void addCar(@RequestBody Car newCar) {
    	carServiceRef.addCar(newCar);
    }
	
	@PutMapping("/cars-api/{carId}")
	public void updateCar(@PathVariable Integer carId, @RequestBody Car updatedCar) {
	    updatedCar.setCarId(carId); // ensure correct ID
	    carServiceRef.updateCar(carId, updatedCar);
	}

	
	@DeleteMapping("/cars-api/{carId}")
	public void deleteCar(@PathVariable Integer carId) {
	    carServiceRef.deleteCar(carId);
	}

	
}
