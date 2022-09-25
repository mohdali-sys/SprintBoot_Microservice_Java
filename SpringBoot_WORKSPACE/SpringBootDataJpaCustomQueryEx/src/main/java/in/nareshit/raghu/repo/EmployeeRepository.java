package in.nareshit.raghu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.nareshit.raghu.entity.Employee;

public interface EmployeeRepository 
	extends JpaRepository<Employee, Integer>{

	//fetch 1 column data
	@Query("SELECT e.empName FROM Employee e")
	List<String> getAllEmpNames();
	
	//fetch all columns data
	@Query("SELECT e FROM Employee e")
	List<Employee> getAllEmps();
		
	//fetch multiple columns data
	@Query("SELECT e.empName,e.empSal FROM Employee e")
	List<Object[]> getFewEmps();
	
	//----------input-------------
	//fetch 1 column data
	@Query("SELECT e.empName FROM Employee e WHERE e.empDept=:dept")
	List<String> getAllEmpNamesByDept(String dept);
	
	//----------native sql-------------
	@Query(value = "SELECT E.ENAME FROM EMPTAB E WHERE E.EDEPT=?1", nativeQuery = true)
	List<String> getNativeQueryData(String dept);
}

