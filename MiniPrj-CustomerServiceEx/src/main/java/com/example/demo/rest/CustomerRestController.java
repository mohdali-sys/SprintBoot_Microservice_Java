package com.example.demo.rest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/api/customer/")
public class CustomerRestController {
	

	
	@Autowired
	CustomerService customerService;
	
//	@RequestMapping(consumes=MediaType.APPLICATION_XML_VALUE)
	//@RequestMapping(produces = )
	@GetMapping("/product/{id}")
	@RequestMapping(consumes=MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<Product> fetchProduct(@PathVariable("id") int id, HttpServletRequest request, @RequestHeader(value="Authorization") String authorizationHeader ) {
		Product product = customerService.getProductById(id,authorizationHeader);
		return ResponseEntity.ok(product) ;
	}

}
