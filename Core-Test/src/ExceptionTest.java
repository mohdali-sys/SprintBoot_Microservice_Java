
public class ExceptionTest
{

    public static void main(String[] args)
    {
        System.out.println(m1());
    }

    private static int m1()
    {
        try
        {
            System.out.println("In try block");
            int sum = 10 / 0; // here raised arithmetic exception
        }
        catch (ArithmeticException e)
        {
            // e.printStackTrace();

            return 0; // exception overriding JDH overrides exception with retun 0

        }

        return 0;
    }

}
