package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.util.MyMailUtil;

@Component
public class TestEmailRunner implements CommandLineRunner {

	@Autowired
	private MyMailUtil mailUtil;
	
	public void run(String... args) throws Exception {
		
		FileSystemResource file1 = new FileSystemResource("D:\\Downloads\\common\\T-shirt2.png");
		FileSystemResource file2 = new FileSystemResource("D:\\Downloads\\common\\doc.jpg");
		boolean sent = mailUtil.send(
				"sample2025nit@gmail.com", 
				new String[] {
					"gshripal786@gmail.com",
					"kalpana28damu@gmail.com",
					"kavitasample@gmail.com"
				
				}, 
				new String[] {
					"madhukrishna142@gmail.com",
					"dsurvey.2508@gmail.com",
					"vsupekar1111@gmail.com"
				
				},
				"Hello!", 
				"WELCOME", 
				new Resource[] {file1,file2}
				);
		System.out.println(sent);
	}

}
