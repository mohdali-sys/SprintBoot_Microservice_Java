package in.nareshit.raghu;

import org.springframework.stereotype.Component;

@Component("dbc")
//@Scope("singleton")
public class DatabaseCon {

	public DatabaseCon() {
		System.out.println("DATABASE CON IS CREATED");
	}
	
}
