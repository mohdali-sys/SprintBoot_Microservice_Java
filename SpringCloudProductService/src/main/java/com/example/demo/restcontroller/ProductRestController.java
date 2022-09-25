package com.example.demo.restcontroller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductRestController {
	
	@GetMapping("/show")
	public ResponseEntity<String>  showData()
	{
		return new ResponseEntity<String>("Hello",HttpStatus.OK);
	}
}
