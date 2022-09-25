package in.nareshit.raghu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("-------Container is created------------------");
		
		DataBaseCon d1 = ac.getBean("dataBaseCon",DataBaseCon.class);
		DataBaseCon d2 = ac.getBean("dataBaseCon",DataBaseCon.class);
		DataBaseCon d3 = ac.getBean("dataBaseCon",DataBaseCon.class);
		
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d3.hashCode());
		
		TokenService t1 = ac.getBean("tokenService",TokenService.class);
		TokenService t2 = ac.getBean("tokenService",TokenService.class);
		TokenService t3 = ac.getBean("tokenService",TokenService.class);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}
}
