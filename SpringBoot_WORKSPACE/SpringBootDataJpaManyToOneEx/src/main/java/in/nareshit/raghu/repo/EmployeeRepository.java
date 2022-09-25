package in.nareshit.raghu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.nareshit.raghu.entity.Employee;

public interface EmployeeRepository 
	extends JpaRepository<Employee, Integer> {

	/**
	 * SELECT e.empName
	 * 
	 * FROM Employee e 
	 *     LEFT JOIN
 	 *   e.dob  as dept   
	 * 
	 * WHERE dept.deptName=:dname
	 */
	@Query("SELECT e.empName FROM Employee e LEFT JOIN e.dob as dept WHERE dept.deptName=:dname")
	List<String> fetchEmpNamesByDeptName(String dname);
	
}
