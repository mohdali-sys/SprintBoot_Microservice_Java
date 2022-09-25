package in.nareshit.raghu.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import in.nareshit.raghu.entity.Employee;

//@Component
public class TestGetCallRunner implements CommandLineRunner {

	public void run(String... args) throws Exception {
		//1. Define URL
		//String url = "http://localhost:8080/employee/show";
		String url = "http://localhost:8080/employee/find/101";
		
		//2. use restTemplet obj
		RestTemplate rt = new RestTemplate();
		
		//3. make HTTP call
		//ResponseEntity<String> response = rt.getForEntity(url, String.class);
		ResponseEntity<Employee> response = rt.getForEntity(url, Employee.class);
		
		//4. print/use result
		System.out.println(response.getBody());
		System.out.println(response.getStatusCode().name());
		System.out.println(response.getStatusCodeValue());
	}

}
