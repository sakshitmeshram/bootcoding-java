package com.bootcoding.basic.leetcode;

public class AddString {
    public static String addStrings(String num1, String num2) {

        double num11 = Double.valueOf(num1);

        Double num21 = Double.valueOf(num2);


        String s =Double.toString(num11 +  num21);

        return s;
    }

    public static void main(String[] args) {
        String num1 = "3876620623801494171";
        String num2 = "6529364523802684779";


        System.out.println(addStrings(num1,num2));
    }
}
