package com.pms.deloitte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pms.deloitte.dao.ProductDAO;

import com.pms.deloitte.model.Product;
import com.pms.deloitte.service.ProductService;
import com.pms.deloitte.service.ProductServiceImpl;

@Controller
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	
	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public String getAllProducts(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("getAllProducts", this.productService.getAllProducts());
		return "product";
	}
	//add
	@RequestMapping(value="/product/add", method=RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") Product p)
	{	System.out.println("#####product :"+p);
		this.productService.addProduct(p);
		return "redirect:/products";
	}
	
	@RequestMapping(value= "/edit/add/update", method= RequestMethod.POST)
	public String updateProduct(@ModelAttribute("product") Product p)
	{	System.out.println("#####product updating :"+p);
		
		this.productService.updateProduct(p);
		return "redirect:/products";
		
	}
	
	@RequestMapping("/remove/{id}")
    public String deleteProduct(@PathVariable("id") int productId){
		
        this.productService.deleteProduct(productId);
        return "redirect:/products";
    }
	
	
	 @RequestMapping("/edit/{id}")
	    public String editPerson(@PathVariable("id") int productId, Model model){
	        model.addAttribute("product", this.productService.getProductById(productId));
	        model.addAttribute("getAllProducts", this.productService.getAllProducts());
	        return "product";
	    }
		
	
	@RequestMapping("/getProduct/{pId}")
	public Product getProductById(@PathVariable("pId")Integer productId)
	{
		Product product = productService.getProductById(productId);
		return product;
	}
	
	@RequestMapping("/deleteProduct/{pId}")
	public String deleteProductbyId(@PathVariable("pId")Integer productId)
	{
		productService.deleteProduct(productId);
		return "Product deleted";
	}
	
	@RequestMapping("/saveProduct")
	public String saveProduct(Model model)
	{
		model.addAttribute("product", new Product());
		return "product";
	}
	
	@RequestMapping("/saveProductRecord")
	public String saveProductRecord(Model model,Product product)
	{	
		productService.addProduct(product);
		model.addAttribute("product", new Product());
		model.addAttribute("message", product.getProductName()+"Product added");
		return "product";
	}
	
	@RequestMapping("/getProducts")
	public List<Product> getProducts()
	{		 
		return productService.getAllProducts(); 
	}
	

	@RequestMapping("/searchProductsbyname/{name}")
	public List<Product> searchProducts(@PathVariable("name")String productName)
	{
		List<Product> products = productService.searchByProductName(productName);
		return products;		 
		 
	}
	
	@RequestMapping("/searchProductsbyprice/{value}")
	public List<Product> searchProductsbyprice(@PathVariable("value")Integer price)
	{
		List<Product> products = productService.searchByPrice(price);
		return products;		 
		 
	}
	
	@RequestMapping("/searchProductsbypriceinrange/{min}/{max}")
	public List<Product> searchProductsbypriceinrange(@PathVariable("min")Integer price1, @PathVariable("max")Integer price2)
	{
		List<Product> products = productService.searchByPriceiInRange(price1, price2);
		return products;		 
		 
	}
	
}
