package in.nareshit.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.raghu.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
