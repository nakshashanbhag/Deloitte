package com;
import javax.naming.Context;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.delloite.cms.model.Customer;

public class Client {
	public static void main(String[] args) {
		
	
	/*Resource resource = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Customer customer = (Customer) factory.getBean("c");*/
		
		// for only one xml  AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//two xml files with bean in each files
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext(new String[] {"beans.xml","se- cond.xml"});
		Customer customer1 = (Customer) context.getBean("c");
		Customer customer2 = (Customer) context.getBean("c");
		System.out.println(customer1);
		//customer.setCustomerName("chi");
		context.registerShutdownHook();
	}
}
