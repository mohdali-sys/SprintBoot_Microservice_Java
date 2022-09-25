package in.nareshit.raghu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("singleton")
public class DataBaseCon {
	@Value("oracle")
	private String driver;
	@Value("jdbc-orcl")
	private String url;
	
	public DataBaseCon() {
		System.out.println("Database con is created.......................");
	}

	@Override
	public String toString() {
		return "DataBaseCon [driver=" + driver + ", url=" + url + "]";
	}
	
	
}
