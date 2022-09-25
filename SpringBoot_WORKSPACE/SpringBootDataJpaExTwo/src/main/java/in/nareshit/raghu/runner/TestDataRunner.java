package in.nareshit.raghu.runner;

import java.io.FileInputStream;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.entity.Employee;
import in.nareshit.raghu.repo.EmployeeRepository;

@Component
public class TestDataRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	
	public void run(String... args) throws Exception {
		//Reading data from a File to byte[]
		FileInputStream fis = new FileInputStream("D:\\Downloads\\Koala.jpg");
		byte[] img = new byte[fis.available()];
		fis.read(img);
		
		String input = "Hello How are you where are you.. welcome to HYD  Hello How are you where are you.. welcome to HYD  Hello How are you where are you.. welcome to HYD  Hello How are you where are you.. welcome to HYD  ";
		char[] note = input.toCharArray();
		
		repo.save(
				new Employee(105, "AJAY", 
						new Date(), new Date(), new Date(),
						img,note)
				);
		
		
		fis.close();
	}
}
