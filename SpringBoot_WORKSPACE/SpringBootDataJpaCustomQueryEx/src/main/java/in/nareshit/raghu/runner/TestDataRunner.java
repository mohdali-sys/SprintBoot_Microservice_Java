package in.nareshit.raghu.runner;

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
		repo.save(new Employee(101, "AA", 200.0, "DEV"));
		repo.save(new Employee(102, "BB", 300.0, "DEV"));
		repo.save(new Employee(103, "CC", 400.0, "QA"));
		repo.save(new Employee(104, "DD", 500.0, "QA"));
		repo.save(new Employee(105, "EE", 600.0, "BA"));
		
		//---testing methods----------------------
		System.out.println("======================");
		//repo.getAllEmpNames().forEach(System.out::println);
		//repo.getAllEmps().forEach(System.out::println);
		
		/*repo.getFewEmps()
		.stream()
		.map(ob->ob[0]+"-"+ob[1])
		.forEach(System.out::println);*/
		
		//repo.getAllEmpNamesByDept("DEV").forEach(System.out::println);
		
		repo.getNativeQueryData("DEV").forEach(System.out::println);
		
		
		
	}
}
