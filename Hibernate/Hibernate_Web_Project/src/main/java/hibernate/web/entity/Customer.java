package hibernate.web.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Customer_master")
public class Customer {
	@Id
	@Column(name = "customer_id", length = 4)
	private String customerId;
	
	@Column(name = "customer_name", length = 25)
	private String name;
	
public Customer() {
		
	}

	public Customer(String customerId, String name) {
		super();
		this.customerId = customerId;
		this.name = name;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + "]";
	}

	

}
