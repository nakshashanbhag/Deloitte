package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TryDriver {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Loading the Driver
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice :\n1 for printing Table,\n 2 for inserting values");
		int opt = sc.nextInt();
		
		switch(opt)
		{
		case 1: printTable(); break;
		case 2: int id = sc.nextInt();
		String name= sc.next();
		insertRecords(id,name); break;
		}
		
		
	}
	
private static void insertRecords(int id,String name) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Create the connection
		
		Connection con = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
		
		//Creating statements
		Statement state = con.createStatement();
				
		//Execute query
		//int nopOfRecords = state.executeUpdate("insert into hr.stu24 values(id,name)");
		int nopOfRecords = state.executeUpdate( "insert into hr.stu24 values(" + id + ",'" +  name +"')");
		//+ "','" +  lName + "'," +  age + ")";
		
		System.out.println(nopOfRecords+" are inserted");
}


private static void printTable() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Create the connection
		Connection con = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
		
		//Creating statements
		Statement state = con.createStatement();
				
		//Execute query
		ResultSet res = state.executeQuery("select * from hr.stu24");
		while(res.next())
		{
			System.out.println(res.getString(1));
			System.out.println(res.getString(2));
		}
		System.out.println("Driver loaded");
	}
}
