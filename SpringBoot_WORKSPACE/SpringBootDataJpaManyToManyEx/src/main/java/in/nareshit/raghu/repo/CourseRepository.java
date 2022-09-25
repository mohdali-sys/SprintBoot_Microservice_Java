package in.nareshit.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.raghu.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
