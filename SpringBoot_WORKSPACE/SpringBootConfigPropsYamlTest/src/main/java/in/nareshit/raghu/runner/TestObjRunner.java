package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.MyProfileData;

@Component
public class TestObjRunner implements CommandLineRunner {

	@Autowired
	private MyProfileData pob;
	
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(pob);
	}
}
