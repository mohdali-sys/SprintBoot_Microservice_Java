package in.nareshit.raghu.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import in.nareshit.raghu.entity.Student;

public interface StudentRepository 
extends ReactiveMongoRepository<Student, Long>{

}
