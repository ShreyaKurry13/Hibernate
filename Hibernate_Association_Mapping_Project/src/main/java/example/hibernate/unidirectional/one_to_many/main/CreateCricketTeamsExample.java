package example.hibernate.unidirectional.one_to_many.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.unidirectional.one_to_many.entity.CricketTeam;
import example.hibernate.unidirectional.one_to_one.entity.Employee;
import example.hibernate.utils.HibernateUtils;

public class CreateCricketTeamsExample {

	public static void main(String[] args) {
		try  (
				SessionFactory sessionFactoryObject = HibernateUtils.getSessionFactory();
				Session sessionObject = sessionFactoryObject.openSession()) 
		{
				CricketTeam teamIndia = new CricketTeam("IND","India", null);
				CricketTeam teamAustralia = new CricketTeam("AUS","Australia", null);
				Transaction tx = sessionObject.beginTransaction();
				sessionObject.persist(teamIndia);
				sessionObject.persist(teamAustralia);
				tx.commit();
				System.out.println("Cricket Teams Created");
		} 
		catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
