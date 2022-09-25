package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.entity.Admin;
import in.nareshit.raghu.entity.Branch;
import in.nareshit.raghu.repo.AdminRepository;
import in.nareshit.raghu.repo.BranchRepository;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private AdminRepository arepo;
	
	@Autowired
	private BranchRepository brepo;
	
	public void run(String... args) throws Exception {
		Admin a1 = new Admin(55, "AJAY", "ANY");
		Admin a2 = new Admin(56, "SAM", "TNR");
		
		arepo.save(a1);
		arepo.save(a2);
		
		Branch b1 = new Branch(152, "CORE", a1);
		Branch b2 = new Branch(153, "SUP", a2);
		
		brepo.save(b1);
		brepo.save(b2);
	}

}
