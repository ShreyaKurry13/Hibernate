package example.hibernate.bidirectional.many_to_many.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.bidirectional.many_to_many.entity.Candidate;
import example.hibernate.bidirectional.many_to_many.entity.Certification;
import example.hibernate.utils.HibernateUtils;

public class LinkCertificationsToCandidates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
				SessionFactory sessionFactoryObject = HibernateUtils.getSessionFactory();
				Session sessionObject = sessionFactoryObject.openSession()) 
		{
			Certification certification1 = sessionObject.find(Certification.class, "C1");
			Certification certification2 = sessionObject.find(Certification.class, "C2");
			Certification certification4 = sessionObject.find(Certification.class, "C4");
			
			Candidate candidate1 = sessionObject.find(Candidate.class, 101);
			Candidate candidate2 = sessionObject.find(Candidate.class, 102);
			
			Transaction tx = sessionObject.beginTransaction();
				candidate1.addCertification(certification1);
				candidate1.addCertification(certification4);
				
				List<Certification> listOfCertifications = List.of(certification1, certification2, certification4);
				candidate2.setCertifications(listOfCertifications);
			tx.commit();
			System.out.println("Certifications liniked to Candidates.");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
