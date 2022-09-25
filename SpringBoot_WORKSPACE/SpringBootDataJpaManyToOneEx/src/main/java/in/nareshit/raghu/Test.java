package in.nareshit.raghu;

public class Test {

	public static void main(String[] args) {
		
		// == will not compare hashCode....
		// They will check are they referring to same object or not?
		String s1="Hello";
		String s2="Hello";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2); //true
		
		String s3= new String("Hello");
		String s4= new String("Hello");
		
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4); //false
		
	}
}
