package in.nareshit.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.raghu.entity.Branch;

public interface BranchRepository 
	extends JpaRepository<Branch, Integer> {

}
