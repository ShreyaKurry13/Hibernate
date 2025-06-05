package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.CourseData;
import example.hibernate.utils.HibernateUtils;

public class UpdateSingleDataCourseExample {
	public static void main(String[] args) {
		try(
		     SessionFactory sessionFactoryObject = HibernateUtils.getSessionFactory();
			 Session sessionObject = sessionFactoryObject.openSession())
			{
				CourseData foundCourseData =  sessionObject.find(CourseData.class, "C003");
				if (foundCourseData != null) {
				Transaction tx = sessionObject.beginTransaction();
					foundCourseData.setTitle("MS Excel");
					foundCourseData.setFees(9500);
				tx.commit();
				System.out.println("Course Data Updated.");
				}else {
					System.out.println("Course with given ID does not exist!!");
				}
			}
		catch(Exception ex) 
		{
		     ex.printStackTrace();
		}

	}
}

