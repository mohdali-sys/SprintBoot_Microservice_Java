package in.nareshit.raghu.runner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.entity.Employee;
import in.nareshit.raghu.repo.EmployeeRepository;

@Component
public class TestDataRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	
	public void run(String... args) throws Exception {
		Employee emp = new Employee();
		emp.setEmpId(10);
		emp.setEmpName("AA");
		
		List<String> version = Arrays.asList("1A","2B");
		emp.setVersion(version);
		
		Set<String> projects = new HashSet<>();
		projects.add("P1");
		projects.add("P2");
		
		emp.setProjects(projects);
		
		Map<String,String> clients = new HashMap<>();
		clients.put("C1", "NIT");
		clients.put("C2", "ABC");
		
		emp.setClient(clients);
		
		repo.save(emp);
	}
}
