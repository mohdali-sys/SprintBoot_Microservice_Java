package in.nareshit.raghu.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nareshit.raghu.entity.Product;
import in.nareshit.raghu.exception.ProductNotFoundException;
import in.nareshit.raghu.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductRestController {

	@Autowired
	private ProductService service;
	
	@PostMapping("/create")
	public ResponseEntity<String> createProduct(
			@RequestBody Product product
			) 
	{
		Long id = service.saveProduct(product);
		return ResponseEntity.ok("Product created => " + id);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<?> getOneProduct(
			@PathVariable Long id
			) 
	{
		ResponseEntity<?> resp = null;
		try {
			Product p = service.getOneProduct(id);
			resp = new ResponseEntity<Product>(p,HttpStatus.OK);
		} catch (ProductNotFoundException  e) {
			e.printStackTrace();
			resp = new ResponseEntity<String>(
					e.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return resp;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Product>> findAllProducts() 
	{
		return ResponseEntity.ok(service.fetchAllProducts());
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> removeProduct(
			@PathVariable Long id
			) 
	{
		ResponseEntity<String> resp = null;
		try {
			service.removeProduct(id);
			resp = new ResponseEntity<String>(
					"Product Removed " +id ,
					HttpStatus.OK);
		} catch (ProductNotFoundException  e) {
			e.printStackTrace();
			resp = new ResponseEntity<String>(
					e.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return resp;
	}
	
}
