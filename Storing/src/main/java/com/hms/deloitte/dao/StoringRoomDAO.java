package com.hms.deloitte.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hms.deloitte.model.StoringRoom;


@Repository
public interface StoringRoomDAO extends CrudRepository<StoringRoom, Integer> {

	

}
