package example.hibernate.unidirectional.one_to_one.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.unidirectional.one_to_one.entity.Employee;
import example.hibernate.unidirectional.one_to_one.entity.Passport;
import example.hibernate.utils.HibernateUtils;

public class LinkPassportsToEmployeesExample {

	public static void main(String[] args) {

		try  (
				SessionFactory sessionFactoryObject = HibernateUtils.getSessionFactory();
				Session sessionObject = sessionFactoryObject.openSession();) 
		{
			//Find passports which are to be linked.
			Passport passport1 =  sessionObject.find(Passport.class, "P01");
			Passport passport2 = sessionObject.find(Passport.class, "P02");
			
			//Find employees which are to be linked.
			Employee employee1 =  sessionObject.find(Employee.class, 101);
			Employee employee2 = sessionObject.find(Employee.class, 102);
			
			//Link them
			Transaction tx = sessionObject.beginTransaction();
				employee1.setPassportDetails(passport1);
				employee2.setPassportDetails(passport2);
			tx.commit();
			System.out.println("Passports linked to employees.");
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
