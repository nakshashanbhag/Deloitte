package com.delloite.cms.dao.impl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.delloite.cms.dao.CustomerDAO;
import com.delloite.cms.model.Customer;
import com.delloite.utility.DbUtility;



public class CustomerDAOImpl implements CustomerDAO {

	private static final String GET_ALL_CUSTOMER_QUERY = "select * from hr.customer";
	Configuration configuration = new Configuration().configure();
	SessionFactory factory= configuration.buildSessionFactory();
	Session session;
	
	@Override
	public List<Customer> getAllCustomers() {
		//method1
		/*List<Customer> allCustomers= new ArrayList<Customer>();
		Session session= factory.openSession();
		
		Query query=session.createQuery("from com.delloite.cms.model.Customer");
		
		Iterator<Customer> iterator= query.iterate();
		while(iterator.hasNext())
		{
			Customer customer = iterator.next();
			allCustomers.add(customer);
		}
		
		return allCustomers;*/
		//method2
		Session session= factory.openSession();
		Query query=session.createQuery("from com.delloite.cms.model.Customer");
		return query.list();
		
		//method 3
		/*session = factory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		criteria.add(Restrictions.ilike("customerAddress", "Delhi"));
		return criteria.list();*/
	}
	@Override
	public boolean insertCustomer(Customer customer) {
		Session session= factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.close();
		factory.close();
			return true;

	}
	@Override
	public boolean updateCustomer(Customer customer) {
		Session session= factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(customer);
		transaction.commit();
		session.close();
		factory.close();
			return true;

	}
	@Override
	public boolean deleteCustomer(int customerId) {
		Session session= factory.openSession();
		Transaction transaction = session.beginTransaction();
		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		session.delete(customer);
		transaction.commit();
		
		return true;
	}

	@Override
	public Customer searchCustomerById(int customerId) {
		Session session= factory.openSession();
		Customer customer = (Customer) session.get(Customer.class, customerId);
		return customer;
	}

	@Override
	public boolean isCustomerExists(int customerId) {
		Session session= factory.openSession();
		Customer customer = (Customer) session.get(Customer.class, customerId);
		if(customer==null)
			return false;
		else
			return true;
	}

}
