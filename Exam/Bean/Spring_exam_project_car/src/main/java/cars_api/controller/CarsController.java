package cars_api.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cars_api.bean.Cars;
import cars_api.service.CarsService;


@RestController
public class CarsController {
	@Autowired
	private CarsService carsService;
	@GetMapping("/cars-api")
	public Collection<Cars> getAllCars(){
		return carsService.getAllCars();
	}
	
	@GetMapping("/cars-api/{ID}")
	public Cars getOneCar (@PathVariable("ID") Integer carID) {
		Cars foundCar =
				carsService.getOneCar(carID);
		return foundCar;
	}
	
	@PostMapping("/cars-api")
	public void createResturant(@RequestBody Cars newcar) {
		carsService.createCar(newcar);
	}
	
	@GetMapping("/cars-api/{min}/{max}")
	public Collection<Cars> getcarbyprice(@PathVariable("min") Double min,@PathVariable("max") Double max) {
		return carsService.getCarsByPriceRange(min, max);
	}
	
	
	
}
