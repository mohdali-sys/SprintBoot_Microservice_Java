package in.nareshit.raghu.db;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dsObj")
public class MyDataSource {
	
	@Value("${my.app.driver-name}")
	private String driver;
	
	@Value("${my.app.url}")
	private String url;
	
	@Value("${my.app.user}")
	private String username;
	
	@Value("${my.app.pwd}")
	private String password;

	//Source > Generate toString > Generate button
	public String toString() {
		return "MyDataSource [driver=" + driver + ", url=" + url + ", username=" + username + ", password=" + password
				+ "]";
	}
	
	
}
