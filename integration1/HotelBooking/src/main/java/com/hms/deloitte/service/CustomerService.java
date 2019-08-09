package com.hms.deloitte.service;
import java.util.List;
import java.util.Optional;

import com.hms.deloitte.model.Customer;


public interface CustomerService {

		public void addCustomer(Customer customer);
		public void deleteCustomer(String Username);
		public void updateCustomer(Customer customer);
		public List<Customer> getAllCustomers();
		public Customer getCustomerByUsername(String customerUsername);
		public String searchByCustomerUsername(String customerUsername, String customerPassword);
		public String searchByCustomerUsername1(String customerUsername);
}
