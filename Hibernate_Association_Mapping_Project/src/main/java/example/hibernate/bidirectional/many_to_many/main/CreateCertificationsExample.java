package example.hibernate.bidirectional.many_to_many.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.bidirectional.many_to_many.entity.Certification;
import example.hibernate.utils.HibernateUtils;

public class CreateCertificationsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
				SessionFactory sessionFactoryObject = HibernateUtils.getSessionFactory();
				Session sessionObject = sessionFactoryObject.openSession())  
		{
			Certification c1 = new Certification("C1","OCJP", null);
			Certification c2 = new Certification("C2","OCWCD", null);
			Certification c3 = new Certification("C3","AWS", null);
			Certification c4 = new Certification("C4","Scrum", null);
			
			Transaction tx = sessionObject.beginTransaction();
				sessionObject.persist(c1);
				sessionObject.persist(c2);
				sessionObject.persist(c3);
				sessionObject.persist(c4);
			tx.commit();
			System.out.println("Certifications added.");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
