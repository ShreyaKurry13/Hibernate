package example.hibernate.main;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.CourseData;
import example.hibernate.utils.HibernateUtils;

public class CreateNewCourseDataExample {

	public static void main(String[] args) {
		try(
		     SessionFactory sessionFactoryObject = HibernateUtils.getSessionFactory();
			 Session sessionObject = sessionFactoryObject.openSession())
			{
			 CourseData courseDataObject = new CourseData("C003","Advance Excel",30,8400);
			 Transaction tx = sessionObject.beginTransaction();
			 sessionObject.persist(courseDataObject);
			 tx.commit();
			 System.out.println("Course Data Created...");
			}
		catch(Exception ex) {
		     ex.printStackTrace();

	}

	}
}
