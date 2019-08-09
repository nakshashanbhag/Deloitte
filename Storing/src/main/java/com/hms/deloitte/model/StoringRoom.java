package com.hms.deloitte.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema ="hr", name = "Storing")

public class StoringRoom {
	
	
	@Id
	private int roomType;
	
	@Column
	private int price;
	
	@Column
	public int noOfRooms;
	
	public StoringRoom() {
	
	}

	public StoringRoom(int roomType, int price, int noOfRooms) {
		super();
		this.roomType = roomType;
		this.price = price;
		this.noOfRooms = noOfRooms;
	}

	public int getRoomType() {
		return roomType;
	}

	public void setRoomType(int roomType) {
		this.roomType = roomType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	@Override
	public String toString() {
		return "StoringRoom [roomType=" + roomType + ", price=" + price + ", noOfRooms=" + noOfRooms + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + noOfRooms;
		result = prime * result + price;
		result = prime * result + roomType;
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
		StoringRoom other = (StoringRoom) obj;
		if (noOfRooms != other.noOfRooms)
			return false;
		if (price != other.price)
			return false;
		if (roomType != other.roomType)
			return false;
		return true;
	}

	


	

	

}
