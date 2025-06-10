package example.hibernate.unidirectional.one_to_many.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.unidirectional.one_to_many.entity.CricketPlayer;
import example.hibernate.unidirectional.one_to_many.entity.CricketTeam;
import example.hibernate.utils.HibernateUtils;

public class CreateCricketPlayersExample {

	public static void main(String[] args) {
		try  (
				SessionFactory sessionFactoryObject = HibernateUtils.getSessionFactory();
				Session sessionObject = sessionFactoryObject.openSession()) 
		{
				CricketPlayer player1  = new CricketPlayer(101, "Virat Kohli", 37);
				CricketPlayer player2  = new CricketPlayer(102, "Rohit Sharma", 38);
				CricketPlayer player3  = new CricketPlayer(103, "Hardik Pandya", 32);
				CricketPlayer player4  = new CricketPlayer(104, "Pat Cummins", 35);
				CricketPlayer player5  = new CricketPlayer(105, "Travis Head", 32);
				Transaction tx = sessionObject.beginTransaction();
				sessionObject.persist(player1);
				sessionObject.persist(player2);
				sessionObject.persist(player3);
				sessionObject.persist(player4);
				sessionObject.persist(player5);
				tx.commit();
		} 
		catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
