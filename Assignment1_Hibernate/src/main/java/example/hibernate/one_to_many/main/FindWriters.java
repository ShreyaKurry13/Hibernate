package example.hibernate.one_to_many.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import example.hibernate.one_to_many.entity.Writer;
import example.hibernate.utils.HibernateUtils;

public class FindWriters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
				SessionFactory sessionFactoryObject = HibernateUtils.getSessionFactory();
				Session sessionObject = sessionFactoryObject.openSession()) 
		{
			Writer findWriter = sessionObject.find(Writer.class, 102);
			if (findWriter==null) {
				System.out.println("Writer ID does not exist");
			}
			else {
	            if (findWriter.getArticles() == null || findWriter.getArticles().isEmpty()) {
	                System.out.println("Writer exists, but there are no articles.");
	            } else {
	                System.out.println("Articles by writer " + findWriter.getName() + ":");
	                findWriter.getArticles().forEach(article -> {
	                    System.out.println("Subject: " + article.getSubject() +
	                                       ", Date: " + article.getDateOfPublication());
	                });
	            }	
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
