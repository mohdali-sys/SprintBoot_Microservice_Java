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
public class TestEmpRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	
	public void run(String... args) throws Exception {
		List<String> list = Arrays.asList("1A","2B");
		
		//Set<String> set = Set.of("p1","p2"); //JDK9
		Set<String> set = new HashSet<>(); // empty <> - Type inference -- JDK 7
		set.add("P1");
		set.add("P3");
		
		//Map<String,String> map = Map.of("K","V");
		Map<String,String> map = new HashMap<>();
		map.put("C1", "NIT");
		map.put("C2", "ABC");
		
		Employee emp = new Employee(1101, "AJAY", list, set, map);
	
		repo.save(emp);
	}

}
