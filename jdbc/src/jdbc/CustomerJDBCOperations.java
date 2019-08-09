package jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CustomerJDBCOperations {
	
	public static void insertRecords() 
			throws ClassNotFoundException, SQLException {
		
		Connection con = DbUtility.getMyConnection();
		
		//Creating statements
		Statement state = con.createStatement();
		
		//Execute query
		int noOfRecords = state.executeUpdate("insert into hr.customer values(23,'Ray','Chennai',900 )");
		
		System.out.println(noOfRecords+" are inserted");
}

	
	public static void insertRecordsUser() 
			throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);       
		
		System.out.println("Enter customerId :");
		int customerId=sc.nextInt();
		
		System.out.println("Enter name of the customer:");
		String customerName = sc.next();
		
		System.out.println("Enter address of the customer :");
		String customerAddress = sc.next();
		System.out.println("Enter Billamount :");
		int billAmount=sc.nextInt();
		
		
		Connection con = DbUtility.getMyConnection();
		
		//Creating statements
		Statement state = con.createStatement();
		
		//Execute query
		int noOfRecords = state.executeUpdate("insert into hr.customer values("
				+customerId + ",'"+customerName +"','" +customerAddress +"'," +billAmount +")" );
		
		System.out.println(noOfRecords+" are inserted");
}

	
	
	public static void insertRecordsThruPS() 
			throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);       
		
		System.out.println("Enter customerId :");
		int customerId=sc.nextInt();
		
		System.out.println("Enter name of the customer:");
		String customerName = sc.next();
		
		System.out.println("Enter address of the customer :");
		String customerAddress = sc.next();
		System.out.println("Enter Billamount :");
		int billAmount=sc.nextInt();
		
		
		Connection con = DbUtility.getMyConnection();
		
		//Creating statements
		PreparedStatement state = con.prepareStatement("insert into hr.customer values(?,?,?,?)");
		state.setInt(1, customerId);
		state.setString(2, customerName);
		state.setString(3, customerAddress);
		state.setInt(4, billAmount);
		
		//Execute query
		int noOfRecords = state.executeUpdate();
		
		System.out.println(noOfRecords+" are inserted");
}
	
	
	//////////////////////TO DELETE//////////////////////////
	
	public static void deleteRecords() throws SQLException
	{
		Connection con = DbUtility.getMyConnection();
		Statement state = con.createStatement();
		
		//Execute query
		state.executeUpdate("delete from hr.customer");
		System.out.println("Row deleted");
		
	}
}
