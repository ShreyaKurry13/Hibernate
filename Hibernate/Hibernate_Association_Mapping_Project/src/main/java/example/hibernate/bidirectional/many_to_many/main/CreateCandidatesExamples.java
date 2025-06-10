package example.hibernate.bidirectional.many_to_many.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.bidirectional.many_to_many.entity.Candidate;
import example.hibernate.bidirectional.many_to_many.entity.Certification;
import example.hibernate.utils.HibernateUtils;

public class CreateCandidatesExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
				SessionFactory sessionFactoryObject = HibernateUtils.getSessionFactory();
				Session sessionObject = sessionFactoryObject.openSession()) 
		{
			Candidate c1 = new Candidate(101, "Rajeev Arora","BE Comp Science",null);
			Candidate c2 = new Candidate(102, "Anuya Bhatt","MTech",null);
			Candidate c3 = new Candidate(103, "Vikram Gupta","BE Tech",null);
			
			Transaction tx = sessionObject.beginTransaction();
				sessionObject.persist(c1);
				sessionObject.persist(c2);
				sessionObject.persist(c3);
			tx.commit();
			System.out.println("Candidates created");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
