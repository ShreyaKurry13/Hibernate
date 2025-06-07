package example.hibernate.one_to_many.main;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.one_to_many.entity.Article;
import example.hibernate.utils.HibernateUtils;

public class CreateArticlesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
				SessionFactory sessionFactoryObject = HibernateUtils.getSessionFactory();
				Session sessionObject = sessionFactoryObject.openSession()) 
		{
			Article article1 = new Article("A001","Rains",LocalDate.of(2025, 05, 23));
			Article article2 = new Article("A002","Floods",LocalDate.of(2026, 04, 21));
			Article article3 = new Article("A003","News",LocalDate.of(2024, 04, 20));
			
			
			Transaction tx = sessionObject.beginTransaction();
				sessionObject.persist(article1);
				sessionObject.persist(article2);
				sessionObject.persist(article3);
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
