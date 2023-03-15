package com.bootcoding.basic.leetcode;


import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

    public static List<String> letterCasePermutation(String s) {
        List<String> list = new ArrayList<>();
        String[] ch =s.split("");
        for(int i=0;i<ch.length;i++){

            try {
                NumberFormatException n= new NumberFormatException();
                if(n.equals(Integer.parseInt(ch[i]))){

                }
            }catch (Exception e){
                System.out.println(ch[i]);
            }
        }
        return null;
    }


    public static void main(String[] args) {
        String s = "a1b2";
        //System.out.println(letterCasePermutation(s));

        int a=0;
        String j =Integer.toString(a);

        char[] val=j.toCharArray();

        System.out.println(j);

    }
}
