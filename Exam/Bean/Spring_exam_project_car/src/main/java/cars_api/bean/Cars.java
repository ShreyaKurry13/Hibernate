package cars_api.bean;

public class Cars {
	
	private Integer id;
	private String make;
	private String model;
	private int price;
	private int year;
	
	public Cars() {
		// TODO Auto-generated constructor stub
	}

	public Cars(Integer id, String make, String model, int price, int year) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.price = price;
		this.year = year;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
		return "Cars [id=" + id + ", make=" + make + ", model=" + model + ", price=" + price + ", year=" + year + "]";
	}
}
