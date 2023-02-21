package com.bootcoding.basic.leetcode;

import java.util.Arrays;
import java.util.StringJoiner;

public class ReversWord {

    public static void revers(String s){
        String[] s1=s.split(" ");
        for(int i=0;i<s1.length/2;i++){
            String temp = s1[i];
            s1[i]=s1[s1.length-i-1];
            s1[s1.length-i-1]=temp;
        }
        String delimiter =" ";
        String result = String.join(delimiter, s1);


        String[] space = result.split("\\s");

        for(String str : space) {

            if (str.equals("")) {
                String delimiter1 =" ";
                s = String.join(delimiter1, str);
            }
            System.out.println(str);
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        String s="a good   example";
        revers(s);
    }
}
