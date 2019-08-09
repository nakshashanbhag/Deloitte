package com.hms.deloitte.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(schema="hr", name="booking")
public class BookingRoom {

	private int loginId;
	private String location;
	private String checkIn;
	private String checkOut;
	private int noOfPeople;
	private int noOfRooms;
	
	

	public BookingRoom(int loginId, String location, String checkIn, String checkOut, int noOfPeople, int noOfRooms) {
		super();
		this.loginId = loginId;
		this.location = location;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.noOfPeople = noOfPeople;
		this.noOfRooms = noOfRooms;
	}

	public BookingRoom() {
		
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}

	public String getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}

	public int getNoOfPeople() {
		return noOfPeople;
	}

	public void setNoOfPeople(int noOfPeople) {
		this.noOfPeople = noOfPeople;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((checkIn == null) ? 0 : checkIn.hashCode());
		result = prime * result + ((checkOut == null) ? 0 : checkOut.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + loginId;
		result = prime * result + noOfPeople;
		result = prime * result + noOfRooms;
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
		BookingRoom other = (BookingRoom) obj;
		if (checkIn == null) {
			if (other.checkIn != null)
				return false;
		} else if (!checkIn.equals(other.checkIn))
			return false;
		if (checkOut == null) {
			if (other.checkOut != null)
				return false;
		} else if (!checkOut.equals(other.checkOut))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (loginId != other.loginId)
			return false;
		if (noOfPeople != other.noOfPeople)
			return false;
		if (noOfRooms != other.noOfRooms)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BookingRoom [loginId=" + loginId + ", location=" + location + ", checkIn=" + checkIn + ", checkOut="
				+ checkOut + ", noOfPeople=" + noOfPeople + ", noOfRooms=" + noOfRooms + "]";
	}

		
}
