package in.nareshit.raghu.runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.service.ProducerService;

@Component
public class TestProducerRunner {
//implements CommandLineRunner {

	@Autowired
	private ProducerService service;
	
	@Scheduled(fixedDelay = 5000)
	public void send() throws Exception {
	//public void run(String... args) throws Exception {
		service.send("Hello data " + new Date() );
	}

}
