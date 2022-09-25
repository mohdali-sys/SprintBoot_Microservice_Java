package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.entity.StockQuote;
import com.example.demo.util.JsonUtil;

@Component
public class ProducerService {

	@Value("${my.kafka.tpc-name}")
	private String topicName;

	@Autowired
	private KafkaTemplate<String, String> template;

	@Autowired
	private JsonUtil util;

	public void send(StockQuote sq) {
		// Object->JSON(Serialized/Partitions)
		String message = util.toJosn(sq);
		template.send(topicName, message);
	}
}
