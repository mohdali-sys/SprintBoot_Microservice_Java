package in.nareshit.raghu.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter //generates set method
@Getter //generates get method
@ToString //generates toString method
@NoArgsConstructor //generates Zero Param const.
public class Product {

	private int pid;
	private String pcode;
	
	private Set<String> colors;
	private List<Integer> pdims;
	
	private Map<String,String> data;
	private Properties info;
	
}
