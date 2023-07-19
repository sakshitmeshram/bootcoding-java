package com.bootcoding.basic.leetcode;

import java.util.HashMap;
import java.util.Map;

public class DetermineColor {
    public static boolean squareIsWhite(String coordinates) {

        Map<Character,Integer> map=new HashMap<>();
        map.put('a',1);
        map.put('b',2);
        map.put('c',3);
        map.put('d',4);
        map.put('e',5);
        map.put('f',6);
        map.put('g',7);
        map.put('h',8);

        char[]s = coordinates.toCharArray();

        if(alCheck(map.get(s[0]))=="even" && alCheck(s[1])=="odd"){
            return true;
        }
        if(alCheck(map.get(s[0]))=="odd" && alCheck(s[1])=="even"){
            return true;
        }
        return false;
    }
    public static String alCheck(int s){
        if(s%2==0){
            return "even";
        }
        return "odd";
    }

    public static void main(String[] args) {
        String s="h3";

        String coordinates="My name is Haley";
        String []a1=coordinates.split(" ");
        for(String s1:a1){
            System.out.println(s1);
        }
    }
}
