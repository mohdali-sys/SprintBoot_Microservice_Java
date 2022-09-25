package in.nareshit.raghu;

//ctrl+shift+O (Imports)
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// creating container
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		
		//read object
		Object ob = ac.getBean("dbc");
		
		//print
		System.out.println(ob); //ob.toString()
	}
}
