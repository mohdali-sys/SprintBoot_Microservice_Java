package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.bean.MyDbCon;

@Component
public class MessageRunner implements CommandLineRunner {
	
	//to read and use any object from container : Autowired
	@Autowired
	private MyDbCon con; //HAS-A

	@Override
	public void run(String... args) throws Exception {
		System.out.println("FROM MESSAGE RUNNER");
		System.out.println(con);
	}
}
