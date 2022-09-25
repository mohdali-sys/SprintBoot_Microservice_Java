package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductRestController {

	@Value("${server.port}")
	String port;

	@GetMapping("/show")
	public ResponseEntity<String> showData() {
		return new ResponseEntity<String>("Product Service port:" + port, HttpStatus.OK);
	}
}