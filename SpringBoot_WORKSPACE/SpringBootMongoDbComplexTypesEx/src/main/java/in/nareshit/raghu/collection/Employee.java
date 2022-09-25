package in.nareshit.raghu.collection;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection  = "employee")
public class Employee {

	@Id
	private Integer id;
	private String name;
	
	private List<String> projs;
	//private Set<String> projs;
	//private String[] data;
	
	private Map<String,String> clients;
	
	private Address addr;
	
	private List<Profile> pobs;
	
	@DBRef
	private Department dob;
}
