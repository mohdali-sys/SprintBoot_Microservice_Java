package in.nareshit.raghu.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nareshit.raghu.consumer.ProductRestConsumer;

@RestController
@RequestMapping("/order")
public class OrderRestController {
	
	@Autowired
	private ProductRestConsumer consumer;

	@GetMapping("/info")
	public ResponseEntity<String> findDetails() {
		ResponseEntity<String> resp =  consumer.showProductMsg();
		return ResponseEntity.ok("FROM ORDER!!"+ resp.getBody());
	}
}
