package jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice :\n1 To see Client details Table,\n 2 for inserting values");
		int opt = sc.nextInt();
		
		switch(opt)
		{
		case 1: ExtractDatabase.printTable();break;
		case 2: 
			CustomerJDBCOperations.insertRecords();
			break;
		case 3: 
			CustomerJDBCOperations.insertRecordsUser();
			break;
		case 4: CustomerJDBCOperations.insertRecordsThruPS();
			break;
		case 5 :  CustomerJDBCOperations.deleteRecords();
		break;
		}
	}

}
