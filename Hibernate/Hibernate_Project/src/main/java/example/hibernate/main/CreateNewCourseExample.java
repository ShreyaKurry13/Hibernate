package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import example.hibernate.entity.Course;

public class CreateNewCourseExample {
	public static void main(String[]  args) {
		SessionFactory sessionFactoryObject = null;
		Session sessionObject = null;
	try{
		Configuration conf = new Configuration();//Looks for hibernate.properties file.
		conf = conf.configure();//Looks for hibernate.cfg.xml file
	    sessionFactoryObject = conf.buildSessionFactory();
	    sessionObject = sessionFactoryObject.openSession();
	    
	    Course courseObject = new Course("C02", "Adv Java", 100, 8700);
	    Transaction tx = sessionObject.beginTransaction();
	        sessionObject.persist(courseObject);
	    tx.commit();
	    System.out.println("Course Created...");
	    
	}
	catch(Exception ex) {
		ex.printStackTrace();
	}
	finally {
		sessionObject.close();
		sessionFactoryObject.close();
	}
}
}