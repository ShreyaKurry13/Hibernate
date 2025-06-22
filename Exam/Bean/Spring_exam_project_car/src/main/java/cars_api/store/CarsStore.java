package cars_api.store;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import cars_api.bean.Cars;

public class CarsStore {
	
	private static Map<Integer, Cars> allCars;
	
	static {
		allCars = new HashMap<>();
		
		Cars c1 = new Cars(101,"Toyota","Hyundai",450000,2010);
		Cars c2 = new Cars(102,"Nexon","Tata",655000,2020);
		Cars c3 = new Cars(103,"Carens","Kia",1000000,2019);
		Cars c4 = new Cars(104,"WagonR","Maruti",600000,2024);
		
		allCars.put(c1.getId(), c1);
		allCars.put(c2.getId(), c2);
		allCars.put(c3.getId(), c3);
		allCars.put(c4.getId(), c4);
		
	}
		
	public  static Collection<Cars> getAll(){
		Collection<Cars> allAvaliableCars = allCars.values();
		return allAvaliableCars;
	}
	
	public static Cars getOne(Integer carId) {
		Cars foundCars = allCars.get(carId);
		return foundCars;
	}
	
	public static void create(Cars newCars) {
		allCars.put(newCars.getId(), newCars);
	}
	
	public static Collection<Cars> getbyprice(Double min, Double max) {
	    Collection<Cars> matchedCars = new ArrayList<>();
	    for (Cars car : allCars.values()) {
	        if (car.getPrice() >= min && car.getPrice() <= max) {
	            matchedCars.add(car);
	        }
	    }
	    return matchedCars;
	}
}
