package car_api.service;

import car_api.repo.CarRepository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import car_api.entity.Car;

@Service
public class CarService {

	
	@Autowired
	private CarRepository carRepositoryRef;
	
	
	//All Cars
	public Collection<Car> getAllCars(){
		return carRepositoryRef.findAll();
	}
	
	
	
	
	//One Car
	public Car getOneCar(Integer carId) {
		
		Car foundCar = null;
		
		Optional<Car> opt = carRepositoryRef.findById(carId);
		
		if (opt.isPresent()) {
			foundCar = opt.get();
		}
		
		return foundCar;
	}
	
	
	
	
	
	// Car by min and max price
    public List<Car> getByPriceRange(int minPrice, int maxPrice) {
        return carRepositoryRef.findByPriceBetween(minPrice, maxPrice);
    }
    

    
    
    // Car by Make and Year
    public List<Car> findByMakeAndYear(String make, int year){
    	
    	return carRepositoryRef.findByMakeAndYear(make, year);
    }
    
    
    
    
    // Car by make
    public Optional<Car> findByMake(String make){
    	return carRepositoryRef.findByMake(make);
    }
    
    
   
    //Add Car
    public void addCar(Car newCar) {
    	carRepositoryRef.save(newCar);
    }
    
    
    
    //Update
    public void updateCar(Car modifiedCar) {
		carRepositoryRef.save(modifiedCar);
	}
	
    
    
    //Delete
	public void deleteOneCar(Integer carId) {
		carRepositoryRef.deleteById(carId);
	}
    
    
}
