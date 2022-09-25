
public class DataType
{

    public static void main(String[] args)
    {
        byte b = 1;
        int i = 129;
        // b=i ; auto casting not possible here
        b = (byte) i;
        System.out.println(b);

        // boolean b1 = b; incompatible types
        float f = 10;
        double d = f;
        long l = 100;
        f = l; // float range higer than long so auto casting applicable

        short s = 10;
        float sum = f + i;
        System.out.println(sum);

        char c1 = 65;
        char c2 = 90;
        char c3 = 97;
        char c4 = 122;
        System.out.print(c1 + " to ");
        System.out.println(c2);
        System.out.print(c3 + " to ");
        System.out.println(c4);

        char c5 = 'B';
        int i2 = c5; // auto casting applicable
        System.out.println(i2);

    }

}