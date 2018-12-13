package com.company;

// 6. Write a program using any OOP language demonstrate array of interface types (for running polymorphism)

interface MyInterface
{
    void method();
}

class MyInterfaceImp1 implements MyInterface
{
    private int interfaceNumber;

    MyInterfaceImp1(int num)
    {
        this.interfaceNumber = num;
    }

    @Override
    public void method()
    {
        System.out.printf("Interface %d\n", this.interfaceNumber);
    }
}

class MyInterfaceImp2 implements MyInterface
{
    private String interfaceString;

    MyInterfaceImp2(String str)
    {
        this.interfaceString = str;
    }

    @Override
    public void method()
    {
        System.out.println("Interface"+ this.interfaceString);
    }
}

public class Main
{
    static MyInterface[] instances = new MyInterface[20];

    public static void main(String[] args)
    {
        instances[0] = new MyInterfaceImp1(1);
        instances[1] = new MyInterfaceImp2("A");

        instances[0].method();
        instances[1].method();

        // polymorphism: instances[0] is changed from MyInterfaceImp1 to MyInterfaceImp2
        instances[0] = instances[1];
        instances[0].method();

    }
}

