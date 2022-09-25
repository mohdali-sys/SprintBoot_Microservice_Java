package in.nareshit.raghu.collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "employee") //optinal
public class Employee {

	@Id
	private String id; //recomanded to specify PK
	
	private Integer eid;
	private String ename;
	private Double esal;
}
