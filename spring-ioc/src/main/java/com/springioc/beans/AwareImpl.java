package com.springioc.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

//@Component
public class AwareImpl implements BeanNameAware ,BeanFactoryAware,ApplicationContextAware  {

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println(" AwareImpl setBeanFactory called");
		//beanFactory.getBean("airtel",Sim.class).calling();

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println(" AwareImpl setApplicationContext called");
//		applicationContext.getBean("airtel",Sim.class).calling();

	}

	@Override
	public void setBeanName(String name) {
		System.out.println(" AwareImpl setBeanName called");
		System.out.println(name);
		
	}

}
