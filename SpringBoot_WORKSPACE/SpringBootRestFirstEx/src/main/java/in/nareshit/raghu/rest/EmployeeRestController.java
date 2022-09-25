package in.nareshit.raghu.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeRestController {

	//Any of these Return Types : String, void, Collection , ClassType, ResponseEntity<T>
	
	@GetMapping("/all")
	public String getAllEmployees() {
		return "FROM GET ALL";
	}
	
	@PostMapping("/create")
	public String saveEmployees() {
		return "FROM SAVE EMP";
	}
	
	@DeleteMapping("/remove")
	public String removeEmployees() {
		return "FROM DELETE EMP";
	}
	
	@PutMapping("/modify")
	public String updateEmployees() {
		return "FROM UPDATE EMP";
	}
	
	@PatchMapping("/modify/email")
	public String updateEmployeesEmail() {
		return "FROM PATCH EMP";
	}
}
