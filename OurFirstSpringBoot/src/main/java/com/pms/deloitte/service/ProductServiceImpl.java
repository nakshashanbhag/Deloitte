package com.pms.deloitte.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pms.deloitte.dao.ProductDAO;

import com.pms.deloitte.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDAO productDAO;
	@Override
	@Transactional
	public void addProduct(Product product) {
		productDAO.save(product);
	}

	@Override
	@Transactional
	public void deleteProduct(int productId) {
		Product product = new Product();
		product.setProductId(productId);
		productDAO.delete(product);
		
	}

	@Override
	@Transactional
	public void updateProduct(Product product) {
		productDAO.save(product);
		
	}

	@Override
	@Transactional
	public List<Product> getAllProducts() {
		return (List<Product>) productDAO.findAll();
	}

	@Override
	@Transactional
	public Product getProductById(int productId) {
		Optional<Product> product = productDAO.findById(productId);
		if(product.isPresent())
		{
			return(product.get());
		}
		else
			return null;
	}
	
	@Override
	@Transactional
	public void removeProduct(int productId) {
		Product product = new Product();
		product.setProductId(productId);
		
		this.productDAO.delete(product);
	}

	@Override
	@Transactional
	public List<Product> searchByProductName(String productName){
		return productDAO.findByProductName(productName);
		
	}

	@Override
	public List<Product> searchByPrice(Integer price) {
		
		return productDAO.findByPrice(price);
	}

	@Override
	public List<Product> searchByPriceiInRange(Integer min, Integer max) {
		return productDAO.findByPriceBetween(min, max);
	}

	

	

}
