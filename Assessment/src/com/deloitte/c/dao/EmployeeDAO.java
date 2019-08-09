package com.deloitte.c.dao;

import java.util.List;

import com.deloitte.c.model.Employee;



public interface EmployeeDAO {

	public List<Employee> getAllCustomers();
	public boolean insertCustomer(Employee customer);
	public boolean isEmployeeExists(String empId);

}
