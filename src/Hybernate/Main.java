package Hybernate;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Main {

	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("Passenger.cfg.xml");
		System.out.println("Start");
		SessionFactory sessionFactory=con.buildSessionFactory();
		Session session=sessionFactory.openSession();
			Transaction transaction=session.beginTransaction();
	
			Passenger obj=new Passenger();
			obj.setCid(123);
			obj.setName("Shubham");
			obj.setCity1("Mumbai");
			obj.setCity2("Rajkot");
			obj.setSeatnum("C2");
			obj.setCLASS("First");
			
			
			session.save(obj);
			
			transaction.commit();
			session.close();
			sessionFactory.close();
	System.out.println("ENd");
	
	
	}

}
