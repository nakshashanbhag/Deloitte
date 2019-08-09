package com.hms.deloitte.customerserviceimpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.deloitte.dao.CustomerDAO;
import com.hms.deloitte.model.Customer;
import com.hms.deloitte.service.CustomerService;


@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDAO customerDAO;
	@Override
	@Transactional
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub		
		customerDAO.save(customer);
	}
	@Transactional
	@Override
	public void deleteCustomer(String Username) {
		Customer customer = new Customer();
		customer.setCustomerUsername(Username);
		customerDAO.delete(customer);
		
	}
	@Transactional
	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDAO.save(customer);
	}
	@Transactional
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return (List<Customer>) customerDAO.findAll();
	}
	
	@Override
	@Transactional
	public Customer getCustomerByUsername(String customerUsername) {
		// TODO Auto-generated method stub
		Optional<Customer> customer = customerDAO.findByCustomerUsername(customerUsername);
		if(customer.isPresent())
			return customer.get();
		else
		return null;
	}
	@Override
	@Transactional
	public String searchByCustomerUsername(String customerUsername, String customerPassword) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		Optional<Customer> customer1 = customerDAO.findByCustomerUsername(customerUsername);
		if(customer1.isPresent())
			{ customer = customer1.get();
			String pass =customer.getCustomerPassword();
			if(customerPassword.equalsIgnoreCase(pass))
				{return "Logged in successfully";}
			else
				{return "Incorrect password";}
			}
		else
		{return "Please enter valid username";}
	}
	@Override
	@Transactional
	public String searchByCustomerUsername1(String customerUsername) {
		// TODO Auto-generated method stub

		Optional<Customer> customer1 = customerDAO.findByCustomerUsername(customerUsername);
		if(customer1.isPresent())
			{ 
				return "0";
			}
		else
		{return "1";}
	}

}
