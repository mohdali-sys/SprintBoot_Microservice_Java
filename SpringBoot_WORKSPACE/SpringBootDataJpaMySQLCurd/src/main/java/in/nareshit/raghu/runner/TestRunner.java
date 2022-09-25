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
public class TestRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	
	public void run(String... args) throws Exception {
		repo.save(new Product(101, "PEN", 200.0));
		repo.save(new Product(102, "BOOK", 300.0));
		repo.save(new Product(103, "TAB", 400.0));
		repo.save(new Product(104, "LAP", 500.0));
		repo.save(new Product(104, "LAPTOP", 550.0));
		
		
		repo.saveAll(
				Arrays.asList(
						new Product(105, "AA", 650.0),
						new Product(106, "BB", 850.0),
						new Product(107, "CC", 750.0)
						)
				);
		
		System.out.println("------------------------");
		List<Product> list = repo.findAll();
		list.forEach(System.out::println);
		
		System.out.println("-----------------------");
		Optional<Product> opt = repo.findById(107); //PK Input
		if(opt.isPresent()) {
			Product p = opt.get();
			System.out.println(p);
		}else {
			System.out.println("Data Not found");
		}
		
		boolean exist = repo.existsById(108);
		System.out.println(exist);
		
		long count = repo.count();
		System.out.println("No of rows in DB table " +  count);
		
		repo.deleteById(107);
		repo.deleteAll();//delete one by one
		repo.deleteAllInBatch();//delete all at a time
	}

}
