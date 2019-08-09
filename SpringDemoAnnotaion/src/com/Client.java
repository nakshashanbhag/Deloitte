package com;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.delloite.cms.config.AppConfiguration;
import com.delloite.cms.model.Address;
import com.delloite.cms.model.Customer;

public class Client {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		//ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		Customer customer = context.getBean(Customer.class);
		Address address = context.getBean(Address.class);
		
		customer.setCustomerId(123);
		customer.setCustomerName("Kapoor");
		customer.setCustomerAddress("Mumbai");
		customer.setBillAmount(10000);
		
		address.setaId(12433);
		address.setCity("Pune");
		address.setState("Mahharastra");
		
		//customer.setAddress(address);
		
		System.out.println(customer);
		context.registerShutdownHook();
		
	}
}
