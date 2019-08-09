package com.demo.deloitte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.deloitte.DAO.MovieDAO;
import com.demo.deloitte.model.Movie;

@RestController
public class MovieController {
	@Autowired
	MovieDAO movieDAO;
	
	@RequestMapping("/saveMovie")
	public String saveMovie()
	{	Movie movie = new Movie(78,"Shining","Chaithra",8000);
		movieDAO.save(movie);
		System.out.println("Movie saved");
		return null;
	}
}
