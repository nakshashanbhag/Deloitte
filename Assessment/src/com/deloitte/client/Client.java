package com.deloitte.client;

import java.util.Date;
import java.util.List;
import java.util.Scanner;


import com.deloitte.c.dao.EmployeeDAO;
import com.deloitte.c.dao.impl.EmployeeDAOImpl;
import com.deloitte.c.model.Employee;

public class Client {
	public static void main(String[] args) {
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		while (true) {
			System.out.println("M E N U ");
			System.out.println("1.Display all Employee ");
			System.out.println("2.Insert Customer ");
			
			Scanner scanner = new Scanner(System.in);
			int option = scanner.nextInt();

			if (option == 1) {
				List<Employee> allemp = employeeDAO.getAllCustomers();
				System.out.println(allemp);
			}
			
			if (option == 2) {
				System.out.println("Enter employee first name ");
				String Fname = scanner.next();
				System.out.println("Enter employee last name ");
				String LastName = scanner.next();
				
				String dummy1=Fname.substring(0, 2);
				String dummy2=LastName.substring(0,2);
				String EmpId = dummy1+dummy2+0; 
						
				boolean isExists = employeeDAO.isEmployeeExists(EmpId);
				//System.out.println(EmpId+"id");
				if (isExists) {
					System.out.println("Record already exists with customer id :" + EmpId);
					System.out.println("Try again with different customer id ");
				} else {
					
					System.out.println("Enter customer Date of birth ");
					String Dob = scanner.next();
					
					System.out.println("Enter customer address ");
					String Address = scanner.next();
					Employee employee = new Employee(Fname, LastName, EmpId, Dob, Address);
					employeeDAO.insertCustomer(employee);
					System.out.println("INSERTION DONE");
				}
			}
			
			
			
		}
		
				
	}
	
	
	

}
