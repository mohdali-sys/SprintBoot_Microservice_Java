package com.spring.service;

import javax.annotation.Resource;

import com.spring.repository.JpaDao;

public class MyServiceImpl {

	JpaDao repository;
	
	@Resource
	private BankServiceImpl  bankServiceImpl;
	
	static String serviceName;

	public JpaDao getRepository() {
		return repository;
	}

	public void setRepository(JpaDao repository) {
		this.repository = repository;
	}

	public static String getServiceName() {
		return serviceName;
	}

	public static void setServiceName(String serviceName) {
		MyServiceImpl.serviceName = serviceName;
	}

	public BankServiceImpl getBankServiceImpl() {
		return bankServiceImpl;
	}

	public void setBankServiceImpl(BankServiceImpl bankServiceImpl) {
		this.bankServiceImpl = bankServiceImpl;
	}
	
	


}
