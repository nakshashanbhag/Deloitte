package com.hms.deloitte.dao;

import org.springframework.data.repository.CrudRepository;

import com.hms.deloitte.model.BookingRoom;

public interface BookingDAO extends CrudRepository<BookingRoom, Integer> {

	

}
