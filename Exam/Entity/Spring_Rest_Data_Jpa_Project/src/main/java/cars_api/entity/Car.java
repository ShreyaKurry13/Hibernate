package cars_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cars_Master")
public class Car {

	@Id
	@Column(name = "car_id")
	private int carId;
	
	@Column(name = "car_make")
	private String make;
	
	@Column(name = "car_model")
	private String model;
	
	@Column(name = "car_price")
	private int price;
	
	@Column(name = "car_year")
	private int year;
	
	public Car() {
		
	}

	public Car(int carId, String make, String model, int price, int year) {
		super();
		this.carId = carId;
		this.make = make;
		this.model = model;
		this.price = price;
		this.year = year;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", make=" + make + ", model=" + model + ", price=" + price + ", year=" + year
				+ "]";
	}
	
}
