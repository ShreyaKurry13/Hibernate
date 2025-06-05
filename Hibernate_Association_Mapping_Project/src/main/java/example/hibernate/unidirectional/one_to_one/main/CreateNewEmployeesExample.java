package example.hibernate.unidirectional.one_to_one.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.unidirectional.one_to_one.entity.Employee;
import example.hibernate.utils.HibernateUtils;

public class CreateNewEmployeesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try  (
				SessionFactory sessionFactoryObject = HibernateUtils.getSessionFactory();
				Session sessionObject = sessionFactoryObject.openSession();) 
		{
			Employee employee1 = new Employee(101,"Ankit Sinha", 55000, null);
			Employee employee2 = new Employee(102,"Jia Khanna", 75000, null);
			
			Transaction tx = sessionObject.beginTransaction();
				sessionObject.persist(employee1);
				sessionObject.persist(employee2);
			tx.commit();
			System.out.println("Employees created.");
		} 
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
