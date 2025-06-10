package example.hibernate.hql.main;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import example.hibernate.utils.HibernateUtils;

public class SelectClauseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
				SessionFactory sessionFactoryObject = HibernateUtils.getSessionFactory();
				Session sessionObject = sessionFactoryObject.openSession()) 
		{
			String hqlQuery = "select m.title, m.year from Movie m";
			Query<Object[]> queryRef = sessionObject.createQuery(hqlQuery, Object[].class);
			List<Object[]> dataList = queryRef.list();
//			for (Object[] data : dataList) {
//				System.out.println("Title: "+data[0] + ", year: " + data[1]);		
//			}	
			dataList.stream().forEach(data -> System.out.println(data[0] + " " + data[1]));
		}
		catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
		}
	}

}
