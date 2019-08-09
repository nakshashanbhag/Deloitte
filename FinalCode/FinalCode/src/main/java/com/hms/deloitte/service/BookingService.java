package com.hms.deloitte.service;

import com.hms.deloitte.model.BookingRoom;

public interface BookingService {
		
	public void addRoom(BookingRoom br);
	public void deleteRoom(Integer loginId);

}
