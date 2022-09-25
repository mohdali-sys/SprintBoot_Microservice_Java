
public class TestStaticAndNonStaticMember
{
    
    private static String name="ABC";
    
    private  String name1="XYZ";
    
    TestStaticAndNonStaticMember()
    {
        System.out.println("This constructor");
      
    }

    public static void main(String[] args)
    {
     System.out.println("This is main method");
     System.out.println("Static name: "+name);
     
     TestStaticAndNonStaticMember reference=   new TestStaticAndNonStaticMember();
     TestStaticAndNonStaticMember reference1=   new TestStaticAndNonStaticMember();
     reference1.name1="abc12";
     TestStaticAndNonStaticMember reference2=   new TestStaticAndNonStaticMember();
     reference2.name1="xyz1234";
     System.out.println("Non static name: "+reference.name1);
     System.out.println("Non static name: "+reference1.name1);
     System.out.println("Non static name: "+reference2.name1);

    }
    
    private static String m1()
    {
        System.out.println("Static method");
        
        return "m1";
    }
    
    private  String m2()
    {
        System.out.println("Static method");
        
        return "m1";
    }
    
    {
        System.out.println("Non static block");
    }
    
   static {
        System.out.println("Static block");
    }
    

}
