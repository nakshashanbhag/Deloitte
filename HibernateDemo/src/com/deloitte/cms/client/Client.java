package com.deloitte.cms.client;

import org.hibernate.Session;
  
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.exception.Configurable;

import com.deloitte.cms.model.Customer;
import com.deloitte.cms.model.PremierCustomer;

public class Client {
	public static void main(String[] args) {
		//Customer customer= new Customer(15,"Preethi","Delhi",1000);
		
		Configuration configuration = new Configuration().configure();
		SessionFactory factory= configuration.buildSessionFactory();
		Session session= factory.openSession();
		Transaction transaction = session.beginTransaction();
		//Customer customer= (Customer) session.load(Customer.class, 13);
		
		PremierCustomer premierCustomer= new PremierCustomer(155,"Preethi","Delhi",1000);
		premierCustomer.setRewardPoints(109);
		System.out.println(premierCustomer);
		//premierCustomer.setCustomerName("Padala");
		//session.save(customer);
		session.save(premierCustomer);
		transaction.commit();
		session.close();
		factory.close();
	}
}
