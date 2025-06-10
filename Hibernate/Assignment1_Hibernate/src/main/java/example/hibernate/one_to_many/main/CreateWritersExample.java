package example.hibernate.one_to_many.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.one_to_many.entity.Writer;
import example.hibernate.utils.HibernateUtils;

public class CreateWritersExample {
	public static void main(String[] args) {
		try (
				SessionFactory sessionFactoryObject = HibernateUtils.getSessionFactory();
				Session sessionObject = sessionFactoryObject.openSession())  
		{
			Writer writer1 = new Writer(101,"Shreya",null);
			Writer writer2 = new Writer(102,"PK",null);
			
			Transaction tx = sessionObject.beginTransaction();
				sessionObject.persist(writer1);
				sessionObject.persist(writer2);
			tx.commit();
			System.out.println("Writers created");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
