package car_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Car_Master")
public class Car {
	
	@Id
	@Column(name = "car_id")
	private int id;
	@Column(name = "car_make")
	private String make;
	@Column(name = "car_model")
	private String model;
	@Column(name = "car_price")
	private int price;
	@Column(name = "car_year")
	private int year;
	
	public Car(){
		
	}
	
	

	public Car(int id, String make, String model, int price, int year) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.price = price;
		this.year = year;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Car [id=" + id + ", make=" + make + ", model=" + model + ", price=" + price + ", year=" + year + "]";
	}
	
	

}
