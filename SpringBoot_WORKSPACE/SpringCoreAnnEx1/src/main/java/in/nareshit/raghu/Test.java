package in.nareshit.raghu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	//ctrl+F11 / ctrl+Fn+F11
	public static void main(String[] args) {
		//ACAC ctrl+space > Enter key
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		//ac.scan("in.nareshit.raghu"); //find classes from given package
		//ac.refresh(); // create objects inside container
		
		Object ob = ac.getBean("dbObj");
		System.out.println(ob);
	}
}
