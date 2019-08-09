package com.deloitte.cms.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.model.Customer;
import com.deloitte.utility.DbUtility;

public class CustomerDAOImpl implements CustomerDAO {
	private final String SELECT_FROM_CUSTOMER= "select * from hr.customer where customerId=?";
	private final String SELECT_QUERY_CUSTOMER= "insert into hr.customer values(?,?,?,?)";
	private final String UPDATE_QUERY_CUSTOMER= "update hr.customer set customerId=?, customerName=?,customerAddress=?,billAmount=?";
	@Override
	public List<Customer> getAllCustomers()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertCustomer(Customer customer) {
		Connection con = DbUtility.getMyConnection();
		int noOfRecords=0;
		
		try {
			PreparedStatement state = con.prepareStatement(SELECT_QUERY_CUSTOMER);
			state.setInt(1, customer.getCustomerid());
			state.setString(2, customer.getCustomerName());
			state.setString(3, customer.getCustomerAddress());
			state.setInt(4, customer.getBillAmount());
			
			noOfRecords= state.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(noOfRecords==0)
			return false;
		else 
			return true;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		Connection con = DbUtility.getMyConnection();
		int noOfRecords=0;
		
		try {
			PreparedStatement state = con.prepareStatement(UPDATE_QUERY_CUSTOMER);
			state.setInt(1, customer.getCustomerid());
			state.setString(2, customer.getCustomerName());
			state.setString(3, customer.getCustomerAddress());
			state.setInt(4, customer.getBillAmount());
			
			noOfRecords= state.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(noOfRecords==0)
			return false;
		else 
			return true;
	}

	@Override
	public boolean deleteCustomer(int customerId) {

		
		return false;
	}

	@Override
	public Customer searchCustomerById(int customerId) {
		Connection connection = DbUtility.getMyConnection();
		Customer customer = new Customer();
		try {
			PreparedStatement statement = connection.prepareStatement(SELECT_FROM_CUSTOMER);
			statement.setInt(1, customerId);
			ResultSet resultSet = statement.executeQuery();
			resultSet.next();
			
			customer.setCustomerid(resultSet.getInt(1));
			customer.setCustomerName(resultSet.getString(2));
			customer.setCustomerAddress(resultSet.getString(3));
			customer.setBillAmount(resultSet.getInt(4));

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return customer;
	}

	@Override
	public boolean isCustomerExists(int customerId) {
			Connection con = DbUtility.getMyConnection();
			boolean isUserExists = false;
			
			
			try {
				PreparedStatement state = con.prepareStatement(SELECT_FROM_CUSTOMER);
				state.setInt(1,customerId);
				
				ResultSet res = state.executeQuery();
				
				if(res.next())
					isUserExists=true;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return isUserExists;
	}

}
