package in.nareshit.raghu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ecobj")
public class EmailConfig {

	@Value("${my.mail.host}")
	private String host;
	
	@Value("${my.mail.port}")
	private String port;
	
	@Override
	public String toString() {
		return "EmailConfig [host=" + host + ", port=" + port + "]";
	}
	
}
