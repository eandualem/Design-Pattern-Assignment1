package com.company;

// 3. Write a program using any OOP language demonstrate error handling using try, catch and finally blocks

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Integer> fileReader(List<Integer> list, File file){

        BufferedReader reader = null;
        try
        {
            reader = new BufferedReader(new FileReader(file));
            String text = null;

            while ((text = reader.readLine()) != null) {
                list.add(Integer.parseInt(text));
            }
            return list;

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if (reader != null) {
                    reader.close();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        File file = new File("/Users/eandualem/School/Design Pattern/Assignment 1/Q 3/src/com/company/file.txt");

        for (Integer x : list = fileReader(list, file)) {
            System.out.print( x + " ");
        }
    }
}