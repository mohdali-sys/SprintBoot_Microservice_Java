package in.nareshit.raghu.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.nareshit.raghu.collection.Department;

public interface DepartmentRepository extends MongoRepository<Department, Integer> {

}
