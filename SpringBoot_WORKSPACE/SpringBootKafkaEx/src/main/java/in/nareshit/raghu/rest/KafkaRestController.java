package in.nareshit.raghu.rest;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.nareshit.raghu.entity.StockQuote;
import in.nareshit.raghu.service.ProducerService;
import in.nareshit.raghu.store.MessageStore;

@RestController
@RequestMapping("/stock")
public class KafkaRestController {

	@Autowired
	private ProducerService producer;
	
	@Autowired
	private MessageStore store;
	
	//1. send data
	@GetMapping("/add")
	public ResponseEntity<String> sendData(
			@RequestParam String code,
			@RequestParam Double cost
			) 
	{
		StockQuote sq = new StockQuote();
		sq.setCode(code);
		sq.setCost(cost);
		sq.setDte(new Date());
		
		producer.send(sq);
		
		return ResponseEntity.ok("Stock is created using MQs(KAFKA)");
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<StockQuote>> getAll(){
		List<StockQuote> list =  store.getAll();
		return ResponseEntity.ok(list);
	}
	
}
