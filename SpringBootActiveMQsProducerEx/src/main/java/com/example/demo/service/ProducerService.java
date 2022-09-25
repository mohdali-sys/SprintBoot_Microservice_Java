package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProducerService {

	@Value("${my.desti.name}")
	private String destination;
	
	@Autowired
	private JmsTemplate template;
	
	public void send(String message) {
		/*template.send(destination, new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage("HELLO " + new Date());
			}
		});*/
		System.out.println("DATA SENT!!");
		template.send(
				destination, 
				session->session.createTextMessage(message));
	}
}

