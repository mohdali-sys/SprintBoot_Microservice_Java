package in.nareshit.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.raghu.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
