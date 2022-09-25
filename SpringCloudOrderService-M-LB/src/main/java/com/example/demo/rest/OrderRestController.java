package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderRestController {
	@Autowired
	private ProductConsumer consumer;
	@Value("${server.port}")
	String port;
	@GetMapping("/data")
	public ResponseEntity<String> fetchData() {
		String data = consumer.getDataFromProduct();
		return new ResponseEntity<String>(
				"Port:"+port+" , FROM ORDER !!!"+ data, HttpStatus.OK);
	}
}

