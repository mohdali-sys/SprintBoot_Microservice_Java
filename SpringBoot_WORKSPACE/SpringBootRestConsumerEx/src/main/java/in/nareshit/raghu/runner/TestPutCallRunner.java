package in.nareshit.raghu.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TestPutCallRunner implements CommandLineRunner {

	public void run(String... args) throws Exception {
		//1. Define URL
		String url = "http://localhost:8080/employee/update";
		
		//2. use restTemplet obj
		RestTemplate rt = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		String body = "{\"empId\":101,\"empName\":\"AA\" }";
		HttpEntity<String> requestEntity = new HttpEntity<String>(body, headers);
		
		
		//3. make HTTP call
		ResponseEntity<String> response = rt.exchange(url, HttpMethod.PUT, requestEntity, String.class);
		
		//4. print/use result
		System.out.println(response.getBody());
		System.out.println(response.getStatusCode().name());
		System.out.println(response.getStatusCodeValue());
	}

}
