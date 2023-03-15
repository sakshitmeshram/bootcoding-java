package com.bootcoding.basic.leetcode;

public class TruncateSentence {
    public static void truncateSentence(String s, int k) {
        String[] words=s.split(" ");
        String w="";
        for(int i=0;i<k;i++){
           w +=words[i]+" ";
        }
        System.out.println(w);
    }

    public static void main(String[] args) {
        String s= "chopper is not a tanuki";
        truncateSentence(s ,5);
    }
}
