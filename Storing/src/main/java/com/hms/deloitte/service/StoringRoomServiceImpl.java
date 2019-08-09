package com.hms.deloitte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hms.deloitte.dao.StoringRoomDAO;
import com.hms.deloitte.model.StoringRoom;



@Service
public class StoringRoomServiceImpl implements StoringRoomService{


	@Autowired
	StoringRoomDAO storingRoomDAO;
	
	public void setStoringRoomDAO(StoringRoomDAO storingRoomDAO) {
		this.storingRoomDAO = storingRoomDAO;
	}

	

	@Override
	@Transactional
	public void incrementRoom() {
		StoringRoom storingRoom = new StoringRoom();
		storingRoom.noOfRooms--;
		this.storingRoomDAO.save(storingRoom);
	}

	@Override
	@Transactional
	public void decrementRoom() {
		StoringRoom storingRoom = new StoringRoom();
		storingRoom.noOfRooms++;
		this.storingRoomDAO.save(storingRoom);
		
	}

	@Override
	@Transactional
	public List<StoringRoom> listRooms() {
		return (List<StoringRoom>) this.storingRoomDAO.findAll();
		
	}
	

}
