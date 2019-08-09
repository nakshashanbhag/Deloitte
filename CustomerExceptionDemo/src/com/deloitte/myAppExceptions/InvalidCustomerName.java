package com.deloitte.myAppExceptions;

public class InvalidCustomerName extends Exception {
	
	public InvalidCustomerName() 
	{
	}
	
	public InvalidCustomerName(String message) {
		super(message);
		
	}

	
}
