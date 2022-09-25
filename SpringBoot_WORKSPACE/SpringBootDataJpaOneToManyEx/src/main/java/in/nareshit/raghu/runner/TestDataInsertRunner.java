package in.nareshit.raghu.runner;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.entity.Model;
import in.nareshit.raghu.entity.Product;
import in.nareshit.raghu.repo.ModelRepository;
import in.nareshit.raghu.repo.ProductRepository;

@Component
public class TestDataInsertRunner implements CommandLineRunner {

	@Autowired
	private ModelRepository mrepo;
	
	@Autowired
	private ProductRepository prepo;
	
	public void run(String... args) throws Exception {
		Model m1 = new Model(1051,"MINI");
		Model m2 = new Model(1052,"MICRO");
		
		mrepo.save(m1);
		mrepo.save(m2);
		
		Set<Model> set = new HashSet<>();
		set.add(m1);
		set.add(m2);
		
		Product p1 = new Product(10, "SAMSUNG LAPTOP", set);
		prepo.save(p1);
	}

}
