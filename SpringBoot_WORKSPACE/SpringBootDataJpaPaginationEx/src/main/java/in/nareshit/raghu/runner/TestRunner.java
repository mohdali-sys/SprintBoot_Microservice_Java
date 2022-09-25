package in.nareshit.raghu.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
		repo.save(new Product(105, "AA", 550.0));
		
		
		repo.saveAll(
				Arrays.asList(
						new Product(106, "AA", 650.0),
						new Product(107, "BB", 850.0),
						new Product(108, "CC", 750.0)
						)
				);
		System.out.println("-----------------");
		List<Product> list = repo.findAll();
		list.forEach(System.out::println);
		System.out.println("-----------------");
		
		//Input (page number, size)
		Pageable pageable = PageRequest.of(0,3);
		
		Page<Product> page =  repo.findAll(pageable);
		
		//Read page data
		List<Product> pageList = page.getContent();
		pageList.forEach(System.out::println);
		
		//meta data
		System.out.println("First? " + page.isFirst());
		System.out.println("Last? " + page.isLast());
		System.out.println("next? " + page.hasNext());
		System.out.println("previous? " + page.hasPrevious());
		System.out.println("Empty? " + page.isEmpty());
		System.out.println("Size? " + page.getSize());
		System.out.println("Total Page? " + page.getTotalPages());
		System.out.println("Total Row? " + page.getTotalElements());
		
	}

}
