package co.deloitte.app;



import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.deloitte.myAppExceptions.InvalidCustomerIdExeption;
import com.deloitte.myAppExceptions.InvalidCustomerName;
import com.deloitte.myAppExceptions.NegativeBillAmountException;

import co.deloitte.model.Customer;

public class CustomerApp  {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, NegativeBillAmountException, InvalidCustomerIdExeption, InvalidCustomerName {
	 
	try
	 {
	/*	Customer c1 = new Customer(1,"Jon","pune",1000);
		ObjectOutputStream stream = new ObjectOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(
								new File("BatchBatchMates.txt"))));
			stream.writeObject(c1);
			System.out.println(c1.getCustomerName()+"your record saved");
			
			stream.close();*/
		
		a();
	 }
	finally
	{
		
	}



	}

	private static void a() throws IOException, FileNotFoundException, ClassNotFoundException {
		Customer c1 = new Customer();
		ObjectInputStream stream = new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream(
								new File("BatchBatchMates.txt"))));
			c1=(Customer) stream.readObject();
			//System.out.println(c2.getCustomerName()+"your record saved");
			
			stream.close();
		System.out.println(c1);
	}
	 
}

