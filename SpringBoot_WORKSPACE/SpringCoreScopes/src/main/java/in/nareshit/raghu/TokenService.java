package in.nareshit.raghu;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tsc")
@Scope("prototype")
public class TokenService {

	public TokenService() {
		System.out.println("TOKEN SERVICE IS CREATEED");
	}
}
