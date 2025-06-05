package example.hibernate.unidirectional.one_to_many.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.unidirectional.one_to_many.entity.CricketPlayer;
import example.hibernate.unidirectional.one_to_many.entity.CricketTeam;
import example.hibernate.utils.HibernateUtils;

public class LinkCricketPlayersToCricketTeam {

	public static void main(String[] args) {
		try  (
				SessionFactory sessionFactoryObject = HibernateUtils.getSessionFactory();
				Session sessionObject = sessionFactoryObject.openSession()) 
		{
			CricketPlayer player1 = sessionObject.find(CricketPlayer.class, 101);
			CricketPlayer player2 = sessionObject.find(CricketPlayer.class, 102);
			CricketPlayer player3 = sessionObject.find(CricketPlayer.class, 103);
			CricketPlayer player4 = sessionObject.find(CricketPlayer.class, 104);
			CricketPlayer player5 = sessionObject.find(CricketPlayer.class, 105);
			
			CricketTeam teamIndia = sessionObject.find(CricketTeam.class, "IND");
			CricketTeam teamAustralia = sessionObject.find(CricketTeam.class, "AUS");
			Transaction tx = sessionObject.beginTransaction();
			List<CricketPlayer> indianPlayers = List.of(player1,player2,player3);
			teamIndia.setPlayer(indianPlayers);
			
			teamAustralia.addPlayer(player4);
			teamAustralia.addPlayer(player5);
			tx.commit();
	}
    catch (Exception e) {
		e.printStackTrace();
	}
}
}