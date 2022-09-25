package in.nareshit.raghu.runner;

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
		repo.save(new Employee(101, "AJAY", 200.0, "DEV"));
		repo.save(new Employee(102, "SAM", 300.0, "QA"));
		repo.save(new Employee(103, "SYED", 400.0, "BA"));
		repo.save(new Employee(104, "HARI", 600.0, "QA"));
		
		//repo.getEmpNames().forEach(System.out::println);
		
		/*repo.getEmpNamesAndSal()
		.stream()
		.map(ob->ob[0]+"-"+ob[1])
		.forEach(System.out::println);*/
		
		//repo.getAllEmps().forEach(System.out::println);
		
		//repo.fetchEmpnamesByDept("QA").forEach(System.out::println);

		repo.getEmpsDeptData("QA").forEach(System.out::println);
		
	}

}
