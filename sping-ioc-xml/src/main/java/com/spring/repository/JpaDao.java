package com.spring.repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JpaDao {
	
	@PreDestroy
	void preDestory()
	{
		System.out.println(" Airtel preDestory called");	
	}
	
	@PostConstruct
	void postConstruct()
	{
		System.out.println(" Airtel postConstruct called");	
	}

}
