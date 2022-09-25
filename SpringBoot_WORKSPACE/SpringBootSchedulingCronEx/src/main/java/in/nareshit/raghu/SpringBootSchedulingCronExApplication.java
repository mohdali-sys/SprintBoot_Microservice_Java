package in.nareshit.raghu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootSchedulingCronExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSchedulingCronExApplication.class, args);
	}

}
