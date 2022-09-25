package in.nareshit.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import in.nareshit.raghu.entity.Product;

public interface ProductRepository 
	extends JpaRepository<Product, Integer> {

	@Modifying 	//non-select
	@Query("UPDATE Product SET prodCode=:code WHERE prodId=:id")
	public Integer updateProductCodeById(String code,Integer id);
}
