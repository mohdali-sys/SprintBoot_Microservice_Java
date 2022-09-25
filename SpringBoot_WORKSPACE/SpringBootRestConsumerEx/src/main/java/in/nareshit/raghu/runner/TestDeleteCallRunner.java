package in.nareshit.raghu.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

//@Component
public class TestDeleteCallRunner implements CommandLineRunner {

	public void run(String... args) throws Exception {
		//1. Define URL
		String url = "http://localhost:8080/employee/remove/999";
		
		//2. use restTemplet obj
		RestTemplate rt = new RestTemplate();
		
		//3. make HTTP call
		ResponseEntity<String> response = rt.exchange(url, HttpMethod.DELETE, null, String.class);
		
		//4. print/use result
		System.out.println(response.getBody());
		System.out.println(response.getStatusCode().name());
		System.out.println(response.getStatusCodeValue());
	}

}
