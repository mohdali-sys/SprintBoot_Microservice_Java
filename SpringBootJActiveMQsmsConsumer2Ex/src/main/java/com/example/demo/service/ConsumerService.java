package com.example.demo.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerService {

	@JmsListener(destination = "${my.desti.name}")
	public void readData(String message) {
		System.out.println("Consumer2=>" + message);
	}
}
