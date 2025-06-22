package cars_api.repo;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import cars_api.bean.Cars;
import cars_api.store.CarsStore;

@Repository
public class CarsRepoository {
	
	public Collection<Cars> getAllCars(){
		Collection<Cars> allcars = CarsStore.getAll();
		return allcars;
	}
	
	public Cars getOneCar(Integer CarID) {
		return CarsStore.getOne(CarID);
	}

	public void createCar (Cars newCar) {
		CarsStore.create(newCar);
	}
	
    public Collection<Cars> getCarByPrice(Double min, Double max) {
        return CarsStore.getbyprice(min, max);
    }

}
