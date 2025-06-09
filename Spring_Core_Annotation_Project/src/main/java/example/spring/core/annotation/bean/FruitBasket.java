package example.spring.core.annotation.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class FruitBasket {
	
	private int bacthNo;
	private String label;
	@Autowired
	@Qualifier("summerFruits")
	private List<String> fruits;
	
	public FruitBasket() {
		// TODO Auto-generated constructor stub
	}

	public FruitBasket(int bacthNo, String label, List<String> fruits) {
		super();
		this.bacthNo = bacthNo;
		this.label = label;
		this.fruits = fruits;
	}

	public int getBacthNo() {
		return bacthNo;
	}

	public void setBacthNo(int bacthNo) {
		this.bacthNo = bacthNo;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List<String> getFruits() {
		return fruits;
	}

	public void setFruits(List<String> fruits) {
		this.fruits = fruits;
	}

	@Override
	public String toString() {
		return "FruitBasket [bacthNo=" + bacthNo + ", label=" + label + ", fruits=" + fruits + "]";
	}

}
