package com.bootcoding.basic.test;

public class BuddyString {

    public static void main(String[] args) {
        String s = "aaaaaaabc";

        String goal = "aaaaaaacb";

        char[] c=s.toCharArray();
        String s1 = "";
        for(int i= c.length-1;i>=0;i--){

            s1= s1+ c[i];
        }

        System.out.println(s1);
    }
}
