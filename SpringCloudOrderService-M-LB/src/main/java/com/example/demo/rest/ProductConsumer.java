package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProductConsumer {

	@Autowired
	private LoadBalancerClient client;

	public String getDataFromProduct() {
		// 1. goto eureka to get MS# details(serviceInstance)
		ServiceInstance si = client.choose("PRODUCT-SERVICE");

		// 2. read URI(IP/PORT) and make URL by adding path
		String url = si.getUri() + "/product/show";

		// 3. use restTemplate and make call
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> response = rt.getForEntity(url, String.class);
		// 4. return the response
		return response.getBody();
	}
}
