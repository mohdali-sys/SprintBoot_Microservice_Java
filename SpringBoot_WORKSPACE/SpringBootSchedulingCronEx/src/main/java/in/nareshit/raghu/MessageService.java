package in.nareshit.raghu;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MessageService {

	@Scheduled(cron="0 0 9 * * * *")
	public void showMsg() {
		System.out.println("HELLO :" + new Date());
	}
}
