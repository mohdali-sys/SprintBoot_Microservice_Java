package in.nareshit.raghu.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.nareshit.raghu.collection.Product;

public interface ProductRepository 
	extends MongoRepository<Product, Integer> {

	
}
