package in.nareshit.raghu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		
		//Object ob = ac.getBean("esObj");
		EmailService es = ac.getBean("esObj",EmailService.class);
		System.out.println(es);
		
		ac.close();
	}
}
