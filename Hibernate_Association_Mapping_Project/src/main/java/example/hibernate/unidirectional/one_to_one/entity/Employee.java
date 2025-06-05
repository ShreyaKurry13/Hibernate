package example.hibernate.unidirectional.one_to_one.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_master")
public class Employee {

	@Id
	@Column(name = "emp_id")
	private Integer empNo;
	
	@Column(name = "emp_name", length = 40)
	private String name;
	
	@Column(name = "emp_salary")
	private int salary;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "passpost_id")
	private Passport passportDetails;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer empNo, String name, int salary, Passport passportDetails) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
		this.passportDetails = passportDetails;
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Passport getPassportDetails() {
		return passportDetails;
	}

	public void setPassportDetails(Passport passportDetails) {
		this.passportDetails = passportDetails;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", salary=" + salary + ", passportDetails="
				+ passportDetails + "]";
	}
	
}
