package com.springioc.example.sping_ioc_xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.repository.JpaDao;
import com.spring.service.BankServiceImpl;
import com.spring.service.MyServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(ac.getBean("jpaDao", JpaDao.class).toString());
	
		// System.out.println(ac.getBean("myServiceImpl",MyServiceImpl.class).toString());
		// No bean named 'myServiceImpl' is defined, if bean atrribute not there
 
		
		System.out.println(ac.getBean("myServiceImpl", MyServiceImpl.class).getServiceName());
		
		System.out.println(ac.getBean("bankService", BankServiceImpl.class).getBankName());
		System.out.println(ac.getBean("myServiceImpl", MyServiceImpl.class).getBankServiceImpl().getBankName());

		ac.close();
	}
}
