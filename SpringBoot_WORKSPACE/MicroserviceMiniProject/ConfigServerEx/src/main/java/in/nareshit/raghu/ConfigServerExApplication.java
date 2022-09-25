package in.nareshit.raghu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerExApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerExApplication.class, args);
	}

}
