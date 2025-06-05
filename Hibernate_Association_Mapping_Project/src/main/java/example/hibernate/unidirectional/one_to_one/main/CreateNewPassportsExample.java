package example.hibernate.unidirectional.one_to_one.main;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.unidirectional.one_to_one.entity.Passport;
import example.hibernate.utils.HibernateUtils;

public class CreateNewPassportsExample {

	public static void main(String [] args) {
		try (
				SessionFactory sessionFactoryObject = HibernateUtils.getSessionFactory();
				Session sessionObject = sessionFactoryObject.openSession();)
		{
			Passport passport1 = new Passport("P01", "Ankit Sinha" , "Mumbai", LocalDate.of(2029, 5, 12));
			
			Passport passport2 = new Passport("P02", "Jia Sharma" , "Hyderabad", LocalDate.of(2034, 10, 22));
			
			Transaction tx = sessionObject.beginTransaction();
				sessionObject.persist(passport1);
				sessionObject.persist(passport2);
			tx.commit();
			System.out.println("Passports created!!!");
		} 
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
