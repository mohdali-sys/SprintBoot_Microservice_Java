package in.nareshit.raghu.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nareshit.raghu.entity.Product;
import in.nareshit.raghu.exception.ProductNotFoundException;
import in.nareshit.raghu.service.IProductService;

@RestController
@RequestMapping("/product")
public class ProductRestController {

	@Autowired
	private IProductService service;
	
	//1. save : JSON-->Object-->save() --> ResponseEntity<String>("SAVED DONE", 200)
	@PostMapping("/create")
	public ResponseEntity<String> saveProduct(
			@RequestBody Product product
			) 
	{
		ResponseEntity<String> response = null;
		Integer id = service.saveProduct(product);
		String body = "Product '"+id+"' created!";
		response = new ResponseEntity<String>(body, HttpStatus.OK);
		return response;
	}
	
	//2. fetch all rows data
	@GetMapping("/all")
	public ResponseEntity<List<Product>> fetchAllProducts() {
		
		ResponseEntity<List<Product>> response = null;
		
		List<Product> list = service.getAllProducts();
		
		response = new ResponseEntity<List<Product>>(list, HttpStatus.OK);
		
		return response;
	}
	
	
	//3. fetch one 
	@GetMapping("/find/{pid}")
	public ResponseEntity<Product> getOneProduct(
			@PathVariable Integer pid
			) 
	{
		ResponseEntity<Product> response = null;
		
		try {
			Product product = service.getOneProduct(pid);
			response = new ResponseEntity<Product>(
					product,HttpStatus.OK);
			
		} catch (ProductNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		
		return response;
	}
	
	//4. delete by id
	@DeleteMapping("/remove/{pid}")
	public ResponseEntity<String> deleteOneProduct(
			@PathVariable Integer pid
			) 
	{
		ResponseEntity<String> response = null;
		try {
			service.deleteProduct(pid);
			response = new ResponseEntity<String>(
					"Product Deleted!",HttpStatus.OK);
			
		} catch (ProductNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		
		return response;
	}
	
	//5. modify data (send product with id)
	@PutMapping("/update")
	public ResponseEntity<String> updateProduct(
			@RequestBody Product product
			) 
	{
		ResponseEntity<String> response = null;
		try {
			service.updateProduct(product);
			response = new ResponseEntity<String>(
					"Product Updated!",HttpStatus.OK);
			
		} catch (ProductNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		
		return response;
	}
	
	//6. partial data update
	@PatchMapping("/modify/{pid}/{pcode}")
	public ResponseEntity<String> updateProductCode(
			@PathVariable Integer pid,
			@PathVariable String pcode
			) 
	{
		ResponseEntity<String> response = null;
		try {
			service.updateProductCodeById(pcode, pid);
			response = new ResponseEntity<String>(
					"Product '"+pid+"' Updated!",HttpStatus.OK);
			
		} catch (ProductNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		
		return response;
	}
	
	
}
