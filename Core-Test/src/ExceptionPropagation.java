
public class ExceptionPropagation
{
    public static void main(String[] args)
    {
        // System.out.println(m1());

        // System.out.println(m2());

        // System.out.println(m3());
        patternPrint();
    }

    private static int m1()
        throws ArithmeticException
    {
        System.out.println("In try block");
        int sum = 10 / 2; // here raised arithmetic exception

        return sum;
    }

    private static int m2()
        throws ArithmeticException
    {

        throw new RuntimeException(); // this is unchecked exception

    }

    private static int m3()
        throws Exception
    {

        throw new Exception(); // this is partial checked exception, In this case its behave like checked exception, But
                               // in method m5 case its behave line unchecked exception

    }

    private static void patternPrint()
    {
        int inputArray[] = { 1, 2, 3, 4, 5, 6, 7 };
        int i = 0;

        for (i = 0; i < inputArray.length / 2; i++)
        {
            System.out.println(inputArray[i] + " " + inputArray[inputArray.length - i - 1]);
        }
        if (inputArray.length % 2 != 0)
        {
            System.out.println(inputArray[inputArray.length / 2] + " " + inputArray[inputArray.length / 2]);
        }
    }

    private static void m5()
    {
        try
        {
            System.out.println("In try block");
        }
        catch (Exception e)
        {
            System.out.println("In try catch");
        }
    }

    private static void m6()
    {
        /*    try
        {
            System.out.println("In try block");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("In try catch");
        }*/

    }
}
