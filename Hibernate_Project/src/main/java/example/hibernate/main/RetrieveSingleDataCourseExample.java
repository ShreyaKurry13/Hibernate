package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.CourseData;
import example.hibernate.utils.HibernateUtils;

public class RetrieveSingleDataCourseExample {
	public static void main(String[] args) {
		try(
		     SessionFactory sessionFactoryObject = HibernateUtils.getSessionFactory();
			 Session sessionObject = sessionFactoryObject.openSession())
			{
//				Class<CourseData> entityType = CourseData.class;
//				Object courseId = "C002";
				CourseData foundCourseData =  sessionObject.find(CourseData.class, "C008");
				if (foundCourseData != null) {
					System.out.println("Found Course ==> " +foundCourseData);
					System.out.println("Course Title: "+foundCourseData.getTitle());
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

