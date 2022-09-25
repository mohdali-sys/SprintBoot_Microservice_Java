package in.nareshit.raghu;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class Product {

	private int pid;
	private String pcode;
	private Vendor vob;//HAS-A
	
}
