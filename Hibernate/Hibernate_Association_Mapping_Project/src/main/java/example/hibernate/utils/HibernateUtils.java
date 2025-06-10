package example.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import example.hibernate.bidirectional.many_to_many.entity.Candidate;
import example.hibernate.bidirectional.many_to_many.entity.Certification;
import example.hibernate.unidirectional.one_to_many.entity.CricketPlayer;
import example.hibernate.unidirectional.one_to_many.entity.CricketTeam;
import example.hibernate.unidirectional.one_to_one.entity.Employee;
import example.hibernate.unidirectional.one_to_one.entity.Passport;

public class HibernateUtils {
	public static SessionFactory getSessionFactory() throws Exception{
		Configuration conf = new Configuration();
		conf.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
//		conf.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/one_to_one");
//		conf.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/one_to_many");
		conf.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/many_to_many");
		conf.setProperty("hibernate.connection.username", "root");
		conf.setProperty("hibernate.connection.password", "root");
		conf.setProperty("hibernate.show_sql", "true");
		conf.setProperty("hibernate.hbm2ddl.auto", "update");
//		conf.addAnnotatedClass(Passport.class);
//		conf.addAnnotatedClass(Employee.class);
//		conf.addAnnotatedClass(CricketPlayer.class);
//		conf.addAnnotatedClass(CricketTeam.class);
		conf.addAnnotatedClass(Candidate.class);
		conf.addAnnotatedClass(Certification.class);
		return conf.buildSessionFactory();
	}
}
