package com.bootcoding.basic.tasksm;

import java.util.*;
import java.util.stream.Collectors;

public class Example4 {
    public static boolean areNumbersAscending(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        String word[] = s.split(" ");

        for (String w : word) {
            try {
                list.add(Integer.parseInt(w));
            } catch (Exception e) {

            }
        }
        boolean flag=false;
        for(int i=0;i<list.size()-1;i++){

            if(list.get(i)<list.get(i+1)){

                flag = true;
            }else {

                return false;
            }

        }

    return flag;
    }


  /*  public  boolean areNumbersAscending(String s) {
        double start = System.currentTimeMillis();
        System.out.println("Start :="+ start);

        String[] str = s.split("\\D");

        boolean flag = false;

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

        for (String sp : str) {

            if (!sp.equals("")) {
                int temp = Integer.parseInt(sp);

                if (map.containsValue(temp)) {

                    return false;
                } else {

                    map.put(temp, temp);
                }

            }
        }

        Set<Integer> set = map.keySet();
        ArrayList<Integer> list = new ArrayList<>(set);

        for(int i=0;i<list.size()-1;i++){

            if(list.get(i)<list.get(i+1)){

                flag = true;
            }else {

                return false;
            }

        }
        double end = System.currentTimeMillis();
        System.out.println(end-start);
        return flag;
    }
    public  boolean areNumbersAscending1(String s) {

        double start = System.currentTimeMillis();
        System.out.println("Start :="+ start);

        int n = -1;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)-'0' >=0 && s.charAt(i)-'0' <= 9){
                int x = s.charAt(i) -'0';
                i++;
                while(i<s.length() && s.charAt(i) != ' '){
                    x = x*10 + (s.charAt(i)-'0');
                    i++;
                }
                if(n >= x) return false;
                n = x;
            }
        }
        double end = System.currentTimeMillis();
        System.out.println(end-start);

        return true;


    }*/









    public static void main(String[] args) {

        Example4 example4 = new Example4();
        String s="sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s";
        System.out.println(example4.areNumbersAscending(s));
    }
}
