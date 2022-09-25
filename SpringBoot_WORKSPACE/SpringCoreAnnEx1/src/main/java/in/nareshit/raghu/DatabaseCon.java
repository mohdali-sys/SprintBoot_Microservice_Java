package in.nareshit.raghu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dbObj")
public class DatabaseCon {
	
	@Value("OracleDriver")
	private String driver;
	
	@Value("jdbc-orcl")
	private String url;
	
	@Override
	public String toString() {
		return "DatabaseCon [driver=" + driver + ", url=" + url + "]";
	}
	
}
