package in.nareshit.raghu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstExampleApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringBootFirstExampleApplication.class, args);
		Object ob = ac.getBean("dsObj");
		System.out.println(ob);
		System.out.println(ac.getClass().getName());
	}

}
