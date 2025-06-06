package example.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import example.hibernate.one_to_many.entity.Article;
import example.hibernate.one_to_many.entity.Writer;

public class HibernateUtils {
	public static SessionFactory getSessionFactory() throws Exception{
		Configuration conf = new Configuration();
		conf.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		conf.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/one_to_many2");
		conf.setProperty("hibernate.connection.username", "root");
		conf.setProperty("hibernate.connection.password", "root");
		conf.setProperty("hibernate.show_sql", "true");
		conf.setProperty("hibernate.hbm2ddl.auto", "update");
		conf.addAnnotatedClass(Article.class);
		conf.addAnnotatedClass(Writer.class);
		return conf.buildSessionFactory();
	}
}
