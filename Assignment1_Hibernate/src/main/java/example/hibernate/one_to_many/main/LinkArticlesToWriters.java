package example.hibernate.one_to_many.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.one_to_many.entity.Article;
import example.hibernate.one_to_many.entity.Writer;
import example.hibernate.utils.HibernateUtils;

public class LinkArticlesToWriters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
				SessionFactory sessionFactoryObject = HibernateUtils.getSessionFactory();
				Session sessionObject = sessionFactoryObject.openSession()) 
		{
			Writer writer1 = sessionObject.find(Writer.class,101);
			Writer writer2 = sessionObject.find(Writer.class,102);
			
			Article article1 = sessionObject.find(Article.class,"A001");
			Article article2 = sessionObject.find(Article.class,"A002");
			Article article3 = sessionObject.find(Article.class,"A003");
			
			Transaction tx = sessionObject.beginTransaction();
			List<Article> articles = List.of(article1,article2);
			writer1.setArticles(articles);
			
			List<Article> articles1 = List.of(article3);
			writer2.setArticles(articles1);
			
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
