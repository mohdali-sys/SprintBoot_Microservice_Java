package in.nareshit.raghu.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import in.nareshit.raghu.entity.Employee;

@RestController
@RequestMapping("/emp")
public class EmployeeRestController {

	@GetMapping("/fetch")
	@ResponseBody
	public Employee getOneEmployee() {
		return new Employee(101, "AA", 500.0);
	}
	
	@PostMapping("/create")
	public String createEmployee(@RequestBody Employee employee) {
		return "Data is " + employee.toString();
	}
	
	@GetMapping("/find/{eid}")
	public String getOneEmpById(@PathVariable Integer eid) {
		return "FETCHING EMP "+ eid;
	}
}
