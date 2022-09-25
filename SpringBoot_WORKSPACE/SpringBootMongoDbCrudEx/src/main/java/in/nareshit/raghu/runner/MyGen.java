package in.nareshit.raghu.runner;

import java.util.Random;

public class MyGen {

	public static Integer getId() {
		return new Random().nextInt(999999);
	}

}
