package com.example.demo.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Product;

@Service
public class CustomerService {

	@Autowired
	RestTemplate restTemplate;

	public Product getProductById(int id,String token) {
		//return restTemplate.getForObject("http://localhost/api/product/" + id, Product.class);
		// create headers
		HttpHeaders headers = new HttpHeaders();

		// set `Content-Type` and `Accept` headers
		headers.setContentType(MediaType.APPLICATION_JSON);
		// example of custom header
		headers.set("Authorization",token);

		// build the request
		HttpEntity<String> entity = new HttpEntity<>(headers);
		//restTemplate.postForEntity(url, request, responseType)
		//restTemplate.postForEntity(url, request, responseType, Object... uriVariables)
		//restTemplate.postForEntity(url, request, responseType,Map<String, ?> uriVariables)
		
		// restTemplate.postForObject(url, request, responseType)
		//restTemplate.postForObject(url, request, responseType, Object... uriVariables)
		//restTemplate.postForObject(url, request, responseType,Map<String, ?> uriVariables)
		
		//restTemplate.postForLocation(url, request)
		//restTemplate.postForLocation(url, request, Object... uriVariables)
		//restTemplate.postForLocation(url, request,Map<String, ?> uriVariables)
		
		//restTemplate.getForEntity(url, responseType)
		//restTemplate.getForEntity(url, responseType, Object... uriVariables)
		// restTemplate.getForEntity(url, responseType, Map<String, ?> uriVariables))
		
		// restTemplate.getForObject(url, responseType)
		//restTemplate.getForObject(url, responseType,  Object... uriVariables)
		//restTemplate.getForObject(url, responseType, Map<String, ?> uriVariables)
		
		//restTemplate.exch
		return restTemplate.exchange("http://localhost/api/product/"+id, HttpMethod.GET, entity,Product.class).getBody();
	}
}
