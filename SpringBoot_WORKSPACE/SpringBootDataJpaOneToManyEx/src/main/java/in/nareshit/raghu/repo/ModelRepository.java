package in.nareshit.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.raghu.entity.Model;

public interface ModelRepository 
extends JpaRepository<Model, Integer> {

}
