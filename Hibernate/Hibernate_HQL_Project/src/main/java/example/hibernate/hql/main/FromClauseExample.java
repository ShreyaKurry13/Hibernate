package example.hibernate.hql.main;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import example.hibernate.hql.entity.Movie;
import example.hibernate.utils.HibernateUtils;

public class FromClauseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
				SessionFactory sessionFactoryObject = HibernateUtils.getSessionFactory();
				Session sessionObject = sessionFactoryObject.openSession()) 
		{
			String hqlQuery = "from Movie m";
			Query<Movie> queryRef = sessionObject.createQuery(hqlQuery, Movie.class);
		    List<Movie> listOfMovies =  queryRef.list();
//		    for (Movie currentMovie : listOfMovies) 
//				System.out.println(currentMovie);
//		    listOfMovies.stream().forEach(currentMovie -> System.out.println(currentMovie.getTitle() +" " + currentMovie.getYear()));
		    listOfMovies.stream().forEach(movie -> System.out.println(movie));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
