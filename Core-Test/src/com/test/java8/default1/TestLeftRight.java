package com.test.java8.default1;

public class TestLeftRight
    implements Left, Right
{
    /* l. Ambigioutiy problem , if both interface conatins same mehod signatue

     * 2. CE : Duplicate default methods named m1 with the parameters () and () are inherited from the types Right and Left
     * ======== Difference between interface with default method and Abstract method ==================
     * Inside interface every varibale alway public static final only and we can't decalare instance varible, But in abstarct class we can declare instanceb varible
     * Interface never talk about state of object , But Abstract method talks about object state.
     * Inside interface we can't  define constructor , But in Abstact class we can define constructor.
     * Inside interface we can't declare static and instance block, But in Abstract class we can
     * Function interface with defaut method can refer to lamda exp. But Asbtract class we can't do this
     * Inside interface we can't override object class inside Abstract class we can ovveride object class.
     * */
    @Override
    public void m1()
    {
        System.out.println("My own implemention");
        Left.super.m1();
    }

    public static void main(String[] args)
    {
        TestLeftRight lr = new TestLeftRight();
        lr.m1();
    }
}
