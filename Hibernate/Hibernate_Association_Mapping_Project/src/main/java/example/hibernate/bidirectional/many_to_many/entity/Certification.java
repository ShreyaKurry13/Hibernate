package example.hibernate.bidirectional.many_to_many.entity;

import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Certification_Master")
public class Certification {
	
	@Id
	@Column(name = "certification_id" , length = 5)
	private String certificationId;
	
	@Column(name = "certification_title" , length = 40)
	private String title;
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "certifications")
	private Collection<Candidate> candidates;
	
	public Certification() {
		// TODO Auto-generated constructor stub
	}

	public Certification(String certificationId, String title, Collection<Candidate> candidates) {
		super();
		this.certificationId = certificationId;
		this.title = title;
		this.candidates = candidates;
	}

	public String getCertificationId() {
		return certificationId;
	}

	public void setCertificationId(String certificationId) {
		this.certificationId = certificationId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Collection<Candidate> getCandidates() {
		return candidates;
	}

	public void setCandidates(Collection<Candidate> candidates) {
		this.candidates = candidates;
	}
	
	public void addCandidate(Candidate candidate) {
		candidates.add(candidate);
	}

	@Override
	public String toString() {
		return "Certification [certificationId=" + certificationId + ", title=" + title + ", candidates=" + candidates
				+ "]";
	}
	
}
