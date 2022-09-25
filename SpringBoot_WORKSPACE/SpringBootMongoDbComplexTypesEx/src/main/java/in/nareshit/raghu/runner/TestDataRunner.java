package in.nareshit.raghu.runner;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.collection.Address;
import in.nareshit.raghu.collection.Department;
import in.nareshit.raghu.collection.Employee;
import in.nareshit.raghu.collection.Profile;
import in.nareshit.raghu.repo.DepartmentRepository;
import in.nareshit.raghu.repo.EmployeeRepository;

@Component
public class TestDataRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	
	@Autowired
	private DepartmentRepository drepo;
	
	
	public void run(String... args) throws Exception {
		repo.deleteAll();
		
		Department d1= new Department(4450, "DEV");
		drepo.save(d1);
		
		repo.save(new Employee(109, "AJAY", 
				Arrays.asList("P1","P2","P3"),
				Map.of("C1","ABC","C2","XYZ"),
				new Address("9/A", "HYD"),
				Arrays.asList(new Profile("PF1", "AA"),new Profile("PF2", "AB")),
				d1
				)
				);
	}

}
