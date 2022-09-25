package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.repo.BookRepository;

@Component
public class TestQueriesRunner implements CommandLineRunner {

	@Autowired
	private BookRepository repo;
	
	public void run(String... args) throws Exception {
		/*Optional<Book> opt = repo.getOneBook(108);
		if(opt.isEmpty()) {
			System.out.println("NO DATA");
		} else {
			System.out.println(opt.get());
		}*/
		
		//repo.getBookByWriterAndCategory("AJAY KUMAR", "Backend").forEach(System.out::println);
		
		//repo.getBooksGtNpgs(180).forEach(System.out::println);
		
		//repo.getBookByWriterOrCategory("AJAY KUMAR", "Backend").forEach(System.out::println);
		
		//repo.getBookA(105).forEach(System.out::println);;
		
		//System.out.println(repo.countDataB("SYED AHMED"));
		//System.out.println(repo.isBookExistByWriter("SYED AHMED"));
		
		//repo.getDataSort("AJAY KUMAR").forEach(System.out::println);;
		
		long count = repo.deleteByCategory("Frontend");
		System.out.println(count);
		
	}

}
