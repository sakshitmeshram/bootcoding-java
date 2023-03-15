package com.bootcoding.basic.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestOddNumber {
        public static String largestOddNumber(String num) {
            List<Integer> list=new ArrayList<>();
            int a=Integer.parseInt(num);
            if(a%2!=0){
                return num;
            }else{
                while (a!=0){
                    int c=a%10;
                    if(c%2!=0){
                        list.add(c);
                    }
                    a=a/10;
                }
            }
           if(list.size()==0){
               return "";
            }
            Collections.sort(list);
            int i=list.size()-1;
           return list.get(i).toString();

        }

    public static void main(String[] args) {
        String a = "4206";
        System.out.println(largestOddNumber(a));;
    }
}
