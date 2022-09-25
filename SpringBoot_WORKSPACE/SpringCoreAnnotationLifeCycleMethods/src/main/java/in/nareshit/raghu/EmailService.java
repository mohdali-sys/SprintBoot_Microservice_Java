package in.nareshit.raghu;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("esObj")
public class EmailService  {
	
	@Value("smtp.gmail.com")
	private String host;
	@Value("587")
	private int port;
	
	@Override
	public String toString() {
		return "EmailService [host=" + host + ", port=" + port + "]";
	}
	
	@PostConstruct
	public void setup() {
		System.out.println("FROM INIT-ANNOTATION");
	}
	
	@PreDestroy
	public void close() {
		System.out.println("FROM DESTORY-ANNOTATION");
	}
	
}
