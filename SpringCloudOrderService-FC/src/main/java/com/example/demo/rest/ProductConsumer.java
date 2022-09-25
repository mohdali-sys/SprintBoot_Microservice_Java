package com.example.demo.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("PRODUCT-SERVICE")
public interface ProductConsumer {

	@GetMapping("/product/show")
	public ResponseEntity<String> showData();

}
