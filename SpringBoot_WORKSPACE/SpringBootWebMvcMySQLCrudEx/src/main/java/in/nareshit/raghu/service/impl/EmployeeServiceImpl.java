package in.nareshit.raghu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nareshit.raghu.entity.Employee;
import in.nareshit.raghu.repo.EmployeeRepository;
import in.nareshit.raghu.service.IEmployeeService;

@Service //cal/Opr, Tx Management..etc
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeRepository repo;

	public Integer saveEmployee(Employee emp) {
		return repo.save(emp).getEmpId();
	}

	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	public Employee getOneEmployee(Integer id) {
		return repo.findById(id).get();
	}

	public void deleteEmployee(Integer id) {
		repo.deleteById(id);
	}

	public void updateEmployee(Employee emp) {
		repo.save(emp);
	}
	
}
