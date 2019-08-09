package com.hms.deloitte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hms.deloitte.model.Customer;
import com.hms.deloitte.service.CustomerService;

@Controller
public class LoginController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/saveCustomer")
	public String saveCustomer(Model model)
	{
		model.addAttribute("customer", new Customer());
		return "customer";
	}
	@RequestMapping("/saveCustomerRecord")
	public String saveCustomerRecord(Model model, Customer customer, String customerUsername)
	{
		String message1 = "Please enter another Username. This is taken.";
		String val = customerService.searchByCustomerUsername1(customerUsername);
		if(val=="1")
			customerService.addCustomer(customer);
		else
			model.addAttribute("displ", message1);
		
		model.addAttribute("customer", new Customer());
		return "customer";
	}
	@RequestMapping("/signIn")
	public String signIn(Model model)
	{
		model.addAttribute("customer", new Customer());
		return "login";
	}
	@RequestMapping("/validate")
	public String validate(Model model, String customerUsername, String customerPassword)
	{
		
		String message=customerService.searchByCustomerUsername(customerUsername, customerPassword);
		model.addAttribute("customer", new Customer());
//		System.out.println(message);
		model.addAttribute("disp", message);
		return "login";
		
	}
	
}
