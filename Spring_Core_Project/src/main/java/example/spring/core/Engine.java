package example.spring.core;

public class Engine {
	private String type;
	private String power;
	public Engine() {
		// TODO Auto-generated constructor stub
	}
	public Engine(String type, String power) {
		super();
		this.type = type;
		this.power = power;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	@Override
	public String toString() {
		return "Engine [type=" + type + ", power=" + power + "]";
	}

}
