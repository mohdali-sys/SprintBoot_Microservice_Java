package in.nareshit.raghu;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TokenService {

	private String token;
	
	public TokenService() {
		token = String.valueOf(new Random().nextInt(9999));
		System.out.println("Token object is created.......");
	}

	@Override
	public String toString() {
		return "TokenService [token=" + token + "]";
	}
	
	
}
