package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.bean.ProductData;

@Component
public class TestYamlRunner implements CommandLineRunner {

	@Autowired
	private ProductData pob;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(pob);
	}

}
