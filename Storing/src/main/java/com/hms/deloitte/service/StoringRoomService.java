package com.hms.deloitte.service;

import java.util.List;

import com.hms.deloitte.model.StoringRoom;

public interface StoringRoomService {
	
	public void  incrementRoom();
	public void  decrementRoom();
	public List<StoringRoom> listRooms();
	
}
