package in.nareshit.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.raghu.entity.Product;

public interface ProductRepository 
	extends JpaRepository<Product, Integer>{

}
