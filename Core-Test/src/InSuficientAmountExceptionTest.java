
public class InSuficientAmountExceptionTest
{

    public static void main(String[] args)
    {
        try
        {
            m1();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public static void m1()
        throws InSuficientAmountException
    {
        try
        {
            System.out.println("In Catch block");
            int sum = 10 / 0;
        }
        catch (ArithmeticException e)
        {
            throw new InSuficientAmountException("amt insufucient");
        }
    }
}
