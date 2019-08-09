package co.deloitte.model;

import java.io.Serializable;

import com.deloitte.myAppExceptions.InvalidCustomerIdExeption;
import com.deloitte.myAppExceptions.InvalidCustomerName;
import com.deloitte.myAppExceptions.NegativeBillAmountException;

public class Customer implements Serializable {
	private int customerId;
	private String customerName;
	private String customerAddress;
	private int billAmount;
	
	public Customer() {
	
	}
	public Customer(int customerId, String customerName, String customerAddress, int billAmount) throws NegativeBillAmountException, 
	InvalidCustomerIdExeption, InvalidCustomerName
	{
		super();
		if(customerId >0)
			this.customerId = customerId;
		else 
			throw new InvalidCustomerIdExeption("Id has to be positive");
		
		
		
		if(customerName!=null)
			this.customerName = customerName;
		else
			throw new InvalidCustomerName("Name shouldn't be null");
		
		this.customerAddress = customerAddress;
		
		
		if(billAmount>0)
			this.billAmount = billAmount;
		else
			throw new NegativeBillAmountException("Bill cannot be negative");
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + billAmount;
		result = prime * result + ((customerAddress == null) ? 0 : customerAddress.hashCode());
		result = prime * result + customerId;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (billAmount != other.billAmount)
			return false;
		if (customerAddress == null) {
			if (other.customerAddress != null)
				return false;
		} else if (!customerAddress.equals(other.customerAddress))
			return false;
		if (customerId != other.customerId)
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		return true;
	}
	
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
			+ customerAddress + ", billAmount=" + billAmount + "]";
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) throws InvalidCustomerIdExeption {
		if(customerId >0)
			this.customerId = customerId;
		else 
			throw new InvalidCustomerIdExeption("Id has to be positive");
		
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) throws InvalidCustomerName {
		if(customerName!=null)
			this.customerName = customerName;
		else
			throw new InvalidCustomerName("Name shouldn't be null");
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public int getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(int billAmount) throws NegativeBillAmountException {
		if(billAmount>0)
			this.billAmount = billAmount;
		else
			throw new NegativeBillAmountException("Bill cannot be negative");
	}
	
	
	

}
