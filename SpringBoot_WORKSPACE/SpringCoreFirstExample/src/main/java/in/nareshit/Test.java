package in.nareshit;

//ctrl+shift+O (imports)
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	//main -> ctrl+space -> enter
	public static void main(String[] args) {
		//1. creating Spring container by reading XML file from src/main/resources folder
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		
		//2. read object 
		Object ob = ac.getBean("dbc");
		
		//3. print data
		System.out.println(ob);
	}
}
