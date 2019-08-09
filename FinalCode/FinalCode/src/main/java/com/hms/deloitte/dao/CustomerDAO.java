package com.hms.deloitte.dao;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hms.deloitte.model.Customer;


	
	@Repository
	public interface CustomerDAO extends CrudRepository<Customer, Integer> {
		
		public Optional<Customer> findByCustomerUsername(String customerUsername);
	}

