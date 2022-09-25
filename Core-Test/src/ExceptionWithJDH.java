
public class ExceptionWithJDH
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

            return 5;
        }
        catch (NullPointerException e)
        {
            // e.printStackTrace();

            return 1; // exception overriding JDH overrides exception with retun 0

        }
        finally
        {
            System.out.println("In finally block");
            return 2;

        }

        // System.out.println("In finally block"); Un-reachable statements

    }

}
