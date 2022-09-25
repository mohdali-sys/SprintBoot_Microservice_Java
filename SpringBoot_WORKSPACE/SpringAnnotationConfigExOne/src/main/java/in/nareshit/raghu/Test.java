package in.nareshit.raghu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//ctr+F11 / ctlr+Fn+F11 (to Run main class)
public class Test {
	//main -> ctrl+space -> enter key
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		//ac.scan("in.nareshit.raghu"); //find classes
		//ac.refresh(); //create all objects for classes found 
		
		//read object from container
		Object ob = ac.getBean("emailSender");
		System.out.println(ob);
	}
}
