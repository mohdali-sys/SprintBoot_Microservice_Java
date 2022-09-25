package com.springioc.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor,Ordered {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(" MyBeanPostProcessor postProcessBeforeInitialization called for bean : " + bean.getClass().getSimpleName());
		
		if(bean instanceof Airtel)
		{
			Airtel airtel =(Airtel)bean;
			airtel.calling();
			
		}
		if(bean instanceof Jio)
		{
			Jio jio =(Jio)bean;
			jio.calling();
			
		}

		
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(" MyBeanPostProcessor postProcessAfterInitialization called for bean :" +  bean.getClass().getSimpleName());
		if(bean instanceof Airtel)
		{
			Airtel airtel =(Airtel)bean;
			airtel.calling();
		}
		return bean;
	}
	
	public void m1()
	{
	}
	@Override
	public int getOrder() {
		System.out.println(" MyBeanPostProcessor Ordered " );
		return 0;
	}
	
}
