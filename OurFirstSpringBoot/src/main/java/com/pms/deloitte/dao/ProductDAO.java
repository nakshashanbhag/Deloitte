package com.pms.deloitte.dao;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pms.deloitte.model.Product;

@Repository
public interface ProductDAO extends CrudRepository<Product, Integer>{

	public List<Product> findByProductName(String prouctName);
	public List<Product> findByPrice(Integer price);
	public List<Product> findByPriceBetween(Integer minimum,Integer maximum);
}
