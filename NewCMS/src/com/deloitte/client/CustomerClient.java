package com.deloitte.client;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.dao.impl.CustomerDAOImpl;
import com.deloitte.cms.model.Customer;

public class CustomerClient {
	public static void main(String[] args) {
		
		int customerId=1;
		CustomerDAO cust1 = new CustomerDAOImpl();
		boolean result = cust1.isCustomerExists(customerId);
		System.out.println(result);
		
		
		//Customer customer = new Customer(12, "chai","tmk",100);
	//	boolean result2= cust1.insertCustomer(customer);
		//System.out.println(result2);
		              

		//Customer customer = new Customer(12, "chai","tmk",100);
		Customer customer = new Customer();
		
		customer.setCustomerid(12);
		customer.setCustomerName("ChaithraS");
		customer.setCustomerAddress("TumkurD");
		customer.setBillAmount(10000);
		
		boolean result3= cust1.insertCustomer(customer);
		System.out.println(result3);
		
		//Search
		int customerId3 = 1;
		Customer result1 = cust1.searchCustomerById(customerId3);
		System.out.println(result1);
		
		
		
	}
}
