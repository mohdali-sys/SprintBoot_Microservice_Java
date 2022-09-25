
public class StringTest
{

    public static void main(String[] args)
    {
        String s = "One" + 1 + 2 + "Two";
        System.out.println(s); // out: One12Two

        // s = "One" + 1 + 2 + "Two"+3+"Three"+4+Four"+5; complation error missing "
        s = 1 + 2 + "One" + "Two" + 3 + 4;
        System.out.println(s); // out: 3OneTwo34

    }

}
