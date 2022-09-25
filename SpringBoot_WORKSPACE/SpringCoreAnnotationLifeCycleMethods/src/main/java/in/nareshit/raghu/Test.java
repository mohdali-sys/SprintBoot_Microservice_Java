package in.nareshit.raghu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//Object ob = ac.getBean("esObj");
		EmailService es = ac.getBean("esObj",EmailService.class);
		System.out.println(es);
		
		//ac.close();
	}
}
