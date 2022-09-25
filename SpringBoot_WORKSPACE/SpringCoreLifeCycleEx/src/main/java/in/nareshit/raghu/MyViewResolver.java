package in.nareshit.raghu;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyViewResolver { //implements InitializingBean, DisposableBean {

	@Value("sample")
	private String prefix;
	
	@PostConstruct
	public void mysetup() {
		System.out.println("FROM INIT METHOD");
	}
	
	@PreDestroy
	public void clear() {
		System.out.println("FROM DESTORY METHOD");
	}
	
	/*
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("FROM INIT METHOD");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("FROM DESTORY METHOD");
	}*/

	@Override
	public String toString() {
		return "MyViewResolver [prefix=" + prefix + "]";
	}
	
	
}
