package in.nareshit.raghu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Object ob1 =  ac.getBean("dbc");
		System.out.println(ob1.hashCode());
		Object ob2 =  ac.getBean("dbc");
		System.out.println(ob2.hashCode());
		Object ob3 =  ac.getBean("dbc");
		System.out.println(ob3.hashCode());
		
		Object ob4 = ac.getBean("tsc");
		System.out.println(ob4.hashCode());
		Object ob5 = ac.getBean("tsc");
		System.out.println(ob5.hashCode());
		Object ob6 = ac.getBean("tsc");
		System.out.println(ob6.hashCode());
	}
}
