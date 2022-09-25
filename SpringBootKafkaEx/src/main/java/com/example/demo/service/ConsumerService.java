package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.example.demo.entity.StockQuote;
import com.example.demo.store.MessageStore;
import com.example.demo.util.JsonUtil;

@Component
public class ConsumerService {
	
	@Autowired
	private JsonUtil util;
	
	@Autowired
	private MessageStore store;

	@KafkaListener(topics = "${my.kafka.tpc-name}",groupId = "my-group")
	public void readData(String message) {
		StockQuote quote = util.fromJson(message);
		store.add(quote);
	}
}

