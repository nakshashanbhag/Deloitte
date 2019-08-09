package com.hms.deloitte.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;
@Entity
@Table(schema="hr", name="Hotelcust")
public class Customer implements Serializable
{		@Id
		private String customerUsername;
		@Column( name="CName")
		private String customerName;
		@Column( name="CPassword")
		private String customerPassword;
		@Column ( name="CContact")
		private int customerContact;
		
		public Customer() {
			// TODO Auto-generated constructor stub
		}

		public Customer(String customerUsername, String customerName, String customerPassword, int customerContact) {
			super();
			this.customerUsername = customerUsername;
			this.customerName = customerName;
			this.customerPassword = customerPassword;
			this.customerContact = customerContact;
		}

		public String getCustomerUsername() {
			return customerUsername;
		}

		public void setCustomerUsername(String customerUsername) {
			this.customerUsername = customerUsername;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getCustomerPassword() {
			return customerPassword;
		}

		public void setCustomerPassword(String customerPassword) {
			this.customerPassword = customerPassword;
		}

		public int getCustomerContact() {
			return customerContact;
		}

		public void setCustomerContact(int customerContact) {
			this.customerContact = customerContact;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + customerContact;
			result = prime * result + ((customerPassword == null) ? 0 : customerPassword.hashCode());
			result = prime * result + ((customerUsername == null) ? 0 : customerUsername.hashCode());
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
			if (customerContact != other.customerContact)
				return false;
			if (customerPassword == null) {
				if (other.customerPassword != null)
					return false;
			} else if (!customerPassword.equals(other.customerPassword))
				return false;
			if (customerUsername != other.customerUsername)
				return false;
			if (customerName == null) {
				if (other.customerName != null)
					return false;
			} else if (!customerName.equals(other.customerName))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "\nCustomer [customerUsername=" + customerUsername + ", customerName=" + customerName + ", customerPassword="
					+ customerPassword + ", customerContact=" + customerContact + "]";
		}
		
		
		
}


