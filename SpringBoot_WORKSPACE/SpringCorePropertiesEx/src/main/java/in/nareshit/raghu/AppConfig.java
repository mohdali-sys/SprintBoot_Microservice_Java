package in.nareshit.raghu;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("in.nareshit.raghu")
@PropertySource("classpath:email.properties")
public class AppConfig {

}
