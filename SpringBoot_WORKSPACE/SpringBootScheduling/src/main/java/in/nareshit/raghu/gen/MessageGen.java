package in.nareshit.raghu.gen;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MessageGen {
	
	/*@Scheduled(fixedDelay = 2000) //2sec [1sec = 1000 mill sec]
	public void showMsgA() {
		System.out.println("Hi " + new Date());
	}

	@Scheduled(fixedDelay = 2000) //2sec [1sec = 1000 mill sec]
	public void showMsgB() {
		System.out.println("HELLO " + new Date());
		try {
			//we have to write logic that takes at least 5 sec
			//pause execution for a period of time
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}*/
	
	@Scheduled(fixedRate = 5000) //5sec [1sec = 1000 mill sec]
	public void showMsgB() {
		System.out.println("HELLO " + new Date());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
