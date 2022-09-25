package in.nareshit.raghu.runenr;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import in.nareshit.raghu.entity.Student;
import reactor.core.publisher.Flux;

@Component
public class TestConsumerRunner implements CommandLineRunner {

	public void run(String... args) throws Exception {
		// 1. Create WebClient object using BasePath
		WebClient client = WebClient.create("http://localhost:8080");

		// 2. create request and execute
		/*
		 * Mono<Student> mono = client.post() //Http Method
		 * .uri("/api/student/create")//Path .body(Mono.just(new
		 * Student(650L,"AA",350.0)), Student.class)//body .retrieve()//execute
		 * .bodyToMono(Student.class); //convertResponse To Mono/Flux
		 * 
		 * //3. print result mono.subscribe(System.out::println);
		 */

		Flux<Student> flux = client.get() // HttpMethod
				.uri("/api/student/all").retrieve() // execute and get response
				.bodyToFlux(Student.class); // convert to Flux
		
		flux.doOnNext(System.out::println).blockLast();
	}

}
