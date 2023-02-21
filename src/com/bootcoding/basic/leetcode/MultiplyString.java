package com.bootcoding.basic.leetcode;

public class MultiplyString {
    public static String multiply(String num1, String num2) {
        Long  n1=Long.parseLong(num1);
        Long n2=Long.parseLong(num2);

        String s=String.valueOf(n2*n1);
        return s;
    }

    public static void main(String[] args) {
        String n1= "123456789";
        String n2="987654321";
        System.out.println(multiply(n1,n2));
    }
}
