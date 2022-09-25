package in.nareshit.raghu;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration // Spring container, please take this inputs
@ComponentScan("in.nareshit.raghu") //to find classes
@PropertySource("classpath:db.properties") // to load properties file
public class AppConfig {

}
