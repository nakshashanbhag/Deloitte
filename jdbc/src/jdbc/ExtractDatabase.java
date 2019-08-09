package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExtractDatabase {
	public static void printTable() throws ClassNotFoundException, SQLException {
		
		Connection con = DbUtility.getMyConnection();
		
		Statement state = con.createStatement();
				
		//Execute query
		ResultSet res = state.executeQuery("select * from hr.customer");
		while(res.next())
		{
			System.out.print(res.getString(1)+" ");
			System.out.print(res.getString(2)+" ");
			System.out.print(res.getString(3)+" ");
			System.out.println(res.getString(4));
		}
		System.out.println("Demo done.");
	}
}

