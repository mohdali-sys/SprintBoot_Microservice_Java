package in.nareshit.raghu.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.nareshit.raghu.bean.Product;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("mybeans.xml");
		Product ob = ac.getBean("pob",Product.class);
		System.out.println(ob);
		//System.out.println(ob.getColors().getClass().getName());
		//System.out.println(ob.getPdims().getClass().getName());
		System.out.println(ob.getData().getClass().getName());
		
	}
}
