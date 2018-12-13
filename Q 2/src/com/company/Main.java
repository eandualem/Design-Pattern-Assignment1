package com.company;

// 2. Write a program using any OOP language demonstrate overloading

public class Main
{
    static SampleClass sc = new SampleClass();

    public static void main(String[] args)
    {
        int x = 5;
        int y = 6;
        int z = 7;
        char c = 'a';

        sc.add(x, y);
        sc.add(x, y, z);
        sc.add(x, c);
        sc.add(c, x);

    }
}

class SampleClass {

    // Initial method
    void add(int x, int y)
    {
        System.out.println(x + y);
    }

    // Different Number of parameters in argument list
    void add(int x, int y, int z)
    {
        System.out.println(x + y + z);
    }

    //  Difference in data type of parameters
    void add(int x, char y)
    {
        System.out.printf("%s%s%n", x, y);
    }

    // Sequence of data type of arguments
    void add(char x, int y)
    {
        System.out.printf("%s%s%n", x, y);
    }


}