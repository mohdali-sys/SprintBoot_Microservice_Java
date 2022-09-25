package in.nareshit.raghu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Object ob = ac.getBean("myViewResolver");
		
		System.out.println(ob);
		
		ac.close();
	}
}
