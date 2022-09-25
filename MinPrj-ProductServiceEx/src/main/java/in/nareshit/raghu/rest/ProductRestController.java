package in.nareshit.raghu.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nareshit.raghu.entity.Product;
import in.nareshit.raghu.service.IProductService;

@RestController
@RequestMapping("/api/product")
public class ProductRestController {

	@Autowired
	private IProductService service;
	
	@PostMapping("/create")
	public ResponseEntity<String> createproduct(
			@RequestBody Product product
			) 
	{
		Long id  = service.createProduct(product);
		return ResponseEntity.ok("Product created with id "+id);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Product>> fetchAllProducts() {
		List<Product> list = service.fetchAllProducts();
		return ResponseEntity.ok(list) ;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> fetchProduct(@PathVariable("id") int id) {
		Product product = service.fetchProductById(id);
		return ResponseEntity.ok(product);
	}
	
}
