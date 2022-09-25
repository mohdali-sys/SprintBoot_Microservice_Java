
public class TestException
{

    public static void main(String[] args)
    {
        try
        {
            int i = 10 / 0;
        }
        catch (Exception e)
        {
            // e.printStackTrace();
            System.out.println("======================================");
            System.out.println(e.toString());
            // e.getMessage()
            // e.fillInStackTrace().toString();
        }

    }

}
