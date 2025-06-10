package example.hibernate.bidirectional.many_to_many.entity;

import java.util.Collection;
import java.util.Iterator;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Candidate_Master")
public class Candidate {
	
	@Id
	@Column(name = "candidate_id", length = 5)
	private Integer candidateId;
	
	@Column(name = "candidate_name", length = 40)
	private String name;
	
	@Column(name = "candidate_qualification", length = 30)
	private String qualification;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "Candidate_Certification",
			joinColumns = {@JoinColumn(name ="cand_id")},
			inverseJoinColumns = {@JoinColumn(name = "cert_id")}
			)
	private Collection<Certification> certifications;
	
	public Candidate() {
		// TODO Auto-generated constructor stub
	}

	public Candidate(Integer candidateId, String name, String qualification, Collection<Certification> certifications) {
		super();
		this.candidateId = candidateId;
		this.name = name;
		this.qualification = qualification;
		this.certifications = certifications;
	}

	public Integer getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(Integer candidateId) {
		this.candidateId = candidateId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Collection<Certification> getCertifications() {
		return certifications;
	}

	public void setCertifications(Collection<Certification> certifications) {
		for (Certification currentCertification : certifications) 
			currentCertification.addCandidate(this);
		this.certifications = certifications;
	}
	
	public void addCertification(Certification certification) {
		certification.addCandidate(this);
		certifications.add(certification);
	}

	@Override
	public String toString() {
		return "Candidate [candidateId=" + candidateId + ", name=" + name + ", qualification=" + qualification
				+ ", certifications=" + certifications + "]";
	}
	
}
