package in.nareshit.raghu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.entity.StockQuote;
import in.nareshit.raghu.store.MessageStore;
import in.nareshit.raghu.util.JsonUtil;

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
