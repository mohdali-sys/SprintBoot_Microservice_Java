package com.test.java8.functional.inf;

public class TestZeroArgsFunctionalInf
{
	String name="My Name";
    public static void main(String[] args)
    {
    	TestZeroArgsFunctionalInf i = new TestZeroArgsFunctionalInf();
    	i.m1();
    	i.m2();

        // If Function inf method have zero args then in lamda exp should use ()
    }
    
    
    public void m1()
    {
    	String s="";
    	   TestZeroArgs a = () -> {System.out.println(" This is zero args function inf method");
           System.out.println(this.toString());
           System.out.println(super.toString());
           System.out.println(this.name);
       //    s="";  // Local variable s defined in an enclosing scope must be final or effectively final
              name="Tabrej Ahamad";  // instance var can be re-assign 
           System.out.println(s);
           System.out.println(name);
           System.out.println(this.name);
           
    	   };

               a.test();	
    	
    }
    
    private void m2()
    {
    	
    	short s = 28;
    	float f = 2.3f;
    	 double d = 2.3;
    	 int I = '1';
    	
    	 for(int i = 0; i < 3; i++) {
    		 
 			for(int j = 3; j >= 0; j--) {
 			    if(i == j) 
 			    continue;
 			    System.out.println(i + " " + j);
 			}
    }
    }
}
