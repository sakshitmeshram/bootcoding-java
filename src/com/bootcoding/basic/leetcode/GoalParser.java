package com.bootcoding.basic.leetcode;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class GoalParser {
    public static String interpret(String date) {
        String [] s= date.replaceAll("st", "").split(" ");
        Map<String,String> map=new HashMap<>();
        map.put("Jan","01");
        map.put("Feb","02");
        map.put("Mar","03");
        map.put("Apr","04");
        map.put("May","05");
        map.put("Jun","06");
        map.put("Jul","07");
        map.put("Aug","08");
        map.put("Sep","09");
        map.put("Oct","10");
        map.put("Nov","11");
        map.put("Dec","12");

        String s1="" ;
        s1  +=s[2];
        s1 +="-";
        s1 +=map.get(s[1]);
        s1 +="-";
        if(s[0].length()<2){
            s1 +=0+s[0];
        }

        return s1;
    }

    public static void main(String[] args) {

        String date = "20rd Oct 2052";

        String[] data = date.split("\\s");

        String test = data[0].replaceAll("\\D"," ").trim();

        if(test.length()<=1){

            test ="0"+test;
        }

        Map<String,String> map=new HashMap<>();
        map.put("Jan","01");
        map.put("Feb","02");
        map.put("Mar","03");
        map.put("Apr","04");
        map.put("May","05");
        map.put("Jun","06");
        map.put("Jul","07");
        map.put("Aug","08");
        map.put("Sep","09");
        map.put("Oct","10");
        map.put("Nov","11");
        map.put("Dec","12");

      String month  = map.get(data[1]);
        System.out.println(data[2]+"-"+month+"-"+test);

        /*ystem.out.println();



        String s = "2st Oct 2052";
        System.out.println(interpret(s));*/



    }
}
