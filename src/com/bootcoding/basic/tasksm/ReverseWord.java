package com.bootcoding.basic.tasksm;

public class ReverseWord {

    public static String reverseWords(String s) {
        String s1[] = s.split(" ");
        String res="";
        for(int i=0;i<s1.length;i++){
            res +=word(s1[i])+" ";
        }
        return res.trim();
    }

    public static String word(String s){

        char [] a=s.toCharArray();

        String s1="";
        for (int i=a.length-1;i>=0;i--){
            s1 += String.valueOf(a[i]);
        }
        return s1;
    }

    public static void main(String[] args) {
        String s="Let's take LeetCode contest";

        System.out.println(reverseWords(s));
    }
}
