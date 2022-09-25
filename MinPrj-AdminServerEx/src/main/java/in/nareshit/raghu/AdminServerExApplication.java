package in.nareshit.raghu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class AdminServerExApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminServerExApplication.class, args);
	}

}
