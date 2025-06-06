package example.hibernate.hql.bean;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import example.hibernate.utils.HibernateUtils;

public class ConstructorExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
				SessionFactory sessionFactoryObject = HibernateUtils.getSessionFactory();
				Session sessionObject = sessionFactoryObject.openSession()) 
		{
			String hqlQuery = "select new example.hibernate.hql.bean.MovieBean(m.title, m.year) from Movie m";
			Query<MovieBean> queryRef = sessionObject.createQuery(hqlQuery, MovieBean.class);
			List<MovieBean> movieList = queryRef.list();
			movieList.stream().forEach(bean -> System.out.println(bean));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
