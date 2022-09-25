package com.springioc.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


// here Artel become default implemention class for ioc
//@Primary
@Component
//@Resource
@Scope("singleton") // default
//@Scope("prototype")
//@Scope("request")       for spring mvc
//@Scope("session")       for spring mcv
//@Scope("globalsession") for spring mvc
public class Airtel
		implements Sim, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

	// InitializingBean and DisposableBean are spring bean life cycle interfaces
	// that method to call during bean initization
	// its just replacement of int-method and destory method
	@Value("99")
	int startSeries;

	@Value("oracleDb")
	String dataSource;

	public Airtel() {
		System.out.println("Airtel instansiated");
	}

	@Override
	public void calling() {
		System.out.println("Calling using airtel sim");

	}

	@Override
	public void data() {
		System.out.println("browsing internet using airtel sim");

	}

	@PreDestroy
	void preDestory() {
		System.out.println(" Airtel preDestory called");
	}

	@PostConstruct
	void postConstruct() {
		System.out.println(" Airtel postConstruct called");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println(" Airtel BeanNameAware setBeanName called");
		// System.out.println(name);

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println(" Airtel BeanFactoryAware setBeanFactory called");
		// beanFactory.getBean("airtel",Sim.class).calling();

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println(" Airtel ApplicationContextAware setApplicationContext called");
//		applicationContext.getBean("airtel",Sim.class).calling();

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(" Airtel InitializingBean afterPropertiesSet  called");
		// To verify all property set
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(" Airtel DisposableBean destroy  called");
		// To ensure all exteranl resorce all close for this bean

	}

	@Override
	public String getDataSource() {
		// TODO Auto-generated method stub
		return dataSource;
	}
}
