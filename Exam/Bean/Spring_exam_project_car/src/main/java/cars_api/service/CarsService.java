package cars_api.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cars_api.bean.Cars;
import cars_api.repo.CarsRepoository;

@Service
public class CarsService {
	
	@Autowired
	private CarsRepoository carsRepoositoryRef;
	public Collection<Cars> getAllCars(){
		return carsRepoositoryRef.getAllCars();
	}
	
	public Cars getOneCar(Integer carId) {
		return carsRepoositoryRef.getOneCar(carId);
	}
	
	public void createCar(Cars newcar) {
		carsRepoositoryRef.createCar(newcar);
	}
	
	public Collection<Cars> getCarsByPriceRange(Double min, Double max) {
        return carsRepoositoryRef.getCarByPrice(min, max);
    }
}