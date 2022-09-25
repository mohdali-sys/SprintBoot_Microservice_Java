
public class MyArthmeticExceptionTest
{

    public static void main(String[] args)
    {

        try
        {
            m1();
        }
        catch (MyArthmeticException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void m1()
        throws MyArthmeticException
    {
        try
        {
            System.out.println("In Catch block");
            int sum = 10 / 0;
        }
        catch (ArithmeticException e)
        {
            throw new MyArthmeticException("***** MyArthmeticException *****");
        }
    }

}
