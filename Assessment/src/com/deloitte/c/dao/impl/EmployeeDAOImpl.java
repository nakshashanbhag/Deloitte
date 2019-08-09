package com.deloitte.c.dao.impl;

import java.sql.Connection;


import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.deloitte.c.dao.EmployeeDAO;
import com.deloitte.c.model.Employee;
import com.deloitte.utility.Utility;


public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String GET_ALL_EMPLOYEE_QUERY = "select * from hr.emp11";

	@Override
	public List<Employee> getAllCustomers() {
		Connection connection = Utility.getMyConnection();
		boolean isUserExists = false;
		
		List<Employee> allEmployee = new ArrayList<Employee>();

		try {
			PreparedStatement statement = connection.prepareStatement(GET_ALL_EMPLOYEE_QUERY);

			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Employee employee = new Employee();
				employee.setFname(resultSet.getString(1));
				employee.setLastName(resultSet.getString(2));
				employee.setEmpid(resultSet.getString(3));
				employee.setDob(resultSet.getString(4));
				employee.setAddress(resultSet.getString(5));
				allEmployee.add(employee);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allEmployee;

	}
	private static final String INSERT_EMPLOYEE_QUERY = "insert into hr.emp11 values (?,?,?,?,?)";

	@Override
	public boolean insertCustomer(Employee employee) {
		Connection connection = Utility.getMyConnection();
		int noOfRecords = 0;
		try {
			PreparedStatement statement = connection.prepareStatement(INSERT_EMPLOYEE_QUERY);
			statement.setString(1, employee.getFname());
			statement.setString(2, employee.getLastName());
			statement.setString(3, employee.getEmpid());
			statement.setString(4, employee.getDob());
			statement.setString(5, employee.getAddress());
			noOfRecords = statement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (noOfRecords == 0)
			return false;
		else
			return true;
	}

	private static final String SELECT_EMPLOYEE_QUERY = "select * from hr.emp11 where EmpId = ?";
	public boolean isEmployeeExists(String Empid) {
		Connection connection = Utility.getMyConnection();
		boolean isUserExists = false;
		try {
			PreparedStatement statement = connection.prepareStatement(SELECT_EMPLOYEE_QUERY);
			statement.setString(1, Empid);

			ResultSet resultSet = statement.executeQuery();

			if (resultSet.next()) {
				isUserExists = true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isUserExists;
	}

	

}
