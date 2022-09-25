package in.nareshit.raghu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nareshit.raghu.entity.Product;
import in.nareshit.raghu.exception.ProductNotFoundException;
import in.nareshit.raghu.repo.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repo;
	
	public Long saveProduct(Product p) {
		return repo.save(p).getProdId();
	}
	
	public Product getOneProduct(Long id) {
		return repo.findById(id)
				.orElseThrow(
						()->new ProductNotFoundException("Not Exist")
						);
	}
	
	public List<Product> fetchAllProducts() {
		return repo.findAll();
	}
	
	public void removeProduct(Long id) {
		repo.delete(getOneProduct(id));
	}
	
}
