package example.hibernate.unidirectional.one_to_one.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Passport_Master")
public class Passport {
	
	@Id
	@Column(name = "passport_no", length =10)
	private String passportNo;
	
	@Column(name = "passport_name", length =40)
	private String name;
	
	@Column(name = "passport_issues_at", length =30)
	private String issuedAt;
	
	@Column(name = "passport_exp_date")
	private LocalDate dateOfExpiry;
	
	public Passport() {
		// TODO Auto-generated constructor stub
		
	}
	public Passport(String passportNo, String name, String issuedAt, LocalDate dateOfExpiry) {
		super();
		this.passportNo = passportNo;
		this.name = name;
		this.issuedAt = issuedAt;
		this.dateOfExpiry = dateOfExpiry;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIssuedAt() {
		return issuedAt;
	}
	public void setIssuedAt(String issuedAt) {
		this.issuedAt = issuedAt;
	}
	public LocalDate getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(LocalDate dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	
	@Override
	public String toString() {
		return "Passport [passportNo=" + passportNo + ", name=" + name + ", issuedAt=" + issuedAt + ", dateOfExpiry="
				+ dateOfExpiry + "]";
	}
}
