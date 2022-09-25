package in.nareshit.raghu.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.collection.Product;
import in.nareshit.raghu.repo.ProductRepository;

@Component
public class TestDataRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	
	public void run(String... args) throws Exception {
		
		repo.deleteAll();
		
		repo.save(new Product(MyGen.getId(), "P1", 500.0));
		repo.save(new Product(102, "P2", 600.0));
		repo.save(new Product(103, "P3", 700.0));
		/*
		repo.saveAll(
				Arrays.asList(
						new Product(104, "P4", 800.0),
						new Product(105, "P5", 900.0),
						new Product(106, "P6", 400.0)
						)
				);*/
		
		repo.findAll().forEach(System.out::println);
		
		Optional<Product> opt = repo.findById(106);
		if(opt.isEmpty()) {
			System.out.println("NO DATA");
		} else {
			System.out.println(opt.get());
		}
		
		repo.deleteById(105);
		
	}

}
