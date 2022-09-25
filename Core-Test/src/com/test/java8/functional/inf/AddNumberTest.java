package com.test.java8.functional.inf;

/*==== Benifit of Lamda expression ===============
1. To enable functional programming in java
2. We can reduce length of the code so that readbility will be improved.
3. We can resolved then complexicity of anonymous inner classes until some extends.
4. We can handle proceduces/functions just like values.
5. We can pass proceduces/functions as arguments.
6. Easier to use update APIs and Librares
7. Enable support for parreller processing.

// class member : static and non-static method , block, variable , constructor , main method
*/

public class AddNumberTest
{
    static int c = 100;

    public static void main(String[] args)
    {
        int a = 10, b = 20;
        FunctionalInf add = () -> {
            c = 200;
            // a=400; // Local variable a defined in an enclosing scope must be final or effectively final
            System.out.println(" a= " + a);
            System.out.println(" b= " + b);
            System.out.println(" c= " + c);
        };
        add.add();
        // a = 200; // Local variable a defined in an enclosing scope must be final or effectively final

        AddNumber res = (x, y) -> {
            return a + b;
        };

        System.out.println("Addition of a x and y :" + res.addnumber(59, 101));
        System.out.println("Calling Function Interface default method :" + res.add(10, 20));

        Runnable run = () -> {
            System.out.println("This custom thread ");
        };

        new Thread(run).start();

        new Thread(() -> {
            System.out.println("Example of method body as arguments");
            m1();
        }).start();

        new Thread(() -> System.out.println("Example of method body as arguments")).start(); // If Lamda exp contains
                                                                                             // single line then no need
                                                                                             // to use curli braces {}
                                                                                             // and semi colne ;

        PrintString ps = s -> System.out.println(s); // If Function interface method contains only one parameter then no
                                                     // need to use ();
        ps.printString("This test hello");
    }

    private static void m1()
    {
        System.out.println("This mehod perform DB task");
    }

}
