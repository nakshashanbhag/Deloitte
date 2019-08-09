package com.demo.deloitte.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.deloitte.model.Movie;
@Repository
public interface MovieDAO extends CrudRepository<Movie, Integer>{

	

}
