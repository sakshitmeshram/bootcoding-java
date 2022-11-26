package com.bootcoding.basic;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class StringTest {

    public void testString(String s){

        char[] a =s.toCharArray();


        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }


    }

    public static void main(String[] args) {

        StringTest stringTest = new StringTest();

        String s = "i am bootcoidng";

        stringTest.testString(s);

    }


}
/*
 for(int i=0;i<s.length();i++){

        int asciivalue = a[i];


        if()




           *//* if(asciivalue>102){

                System.out.println("The ASCII value of " + a+ " is: " + asciivalue);


            }*//*
        }*/
