package in.nareshit.raghu.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.entity.Product;
import in.nareshit.raghu.repo.ProductRepository;

@Component
public class ProductTestRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	
	public void run(String... args) throws Exception {
		repo.save(new Product(101, "PEN", 200.0));//INSERT
		//repo.save(new Product(101, "PEN TAB", 250.0));//UPDATE
		repo.save(new Product(102, "SAMPLE", 280.0));
		repo.save(new Product(103, "TABLE", 300.0));
		repo.save(new Product(104, "TABLET", 500.0));
		repo.save(new Product(105, "LAPTOP", 800.0));
		
		repo.saveAll(
				Arrays.asList(
						new Product(106, "AAA", 900.0),
						new Product(107, "BBB", 600.0),
						new Product(108, "CCC", 800.0),
						new Product(109, "DDD", 500.0)
						)
				);
		
		System.out.println("------------------");
		List<Product> list = repo.findAll();
		list.forEach(System.out::println);
		
		System.out.println("-------------------");
		Optional<Product> opt = repo.findById(106); //fetch one row
		if(opt.isPresent()) { //null check
			System.out.println(opt.get());
		} else {
			System.out.println("NO DATA FOUND");
		}
		
		System.out.println("----------------");
		boolean exist = repo.existsById(109); //id exist or not?
		System.out.println(exist);
		
		
		long count = repo.count();
		System.out.println(count);
		
		repo.deleteById(109);
		repo.deleteAllInBatch(); //delete all 
	}

}
