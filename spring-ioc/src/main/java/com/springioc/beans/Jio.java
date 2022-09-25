package com.springioc.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Primary
@Component
//@Lazy
public class Jio implements Sim {

	@Value("mysqldb")
	String dataSource;

	public String getDataSource() {
		return dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public Jio() {
		System.out.println("Jio instansiated");
	}

	@Override
	public void calling() {
		System.out.println("Calling using jio sim");

	}

	@Override
	public void data() {
		System.out.println("browsing using jio sim");

	}

	@PreDestroy
	void preDestory() {
		System.out.println(" Jio preDestory called");
	}

	@PostConstruct
	void postConstruct() {
		System.out.println(" Jio postConstruct called");
	}

}
