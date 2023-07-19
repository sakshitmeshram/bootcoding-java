package com.bootcoding.basic.leetcode;

public class BasicCalculator2 {
    public int calculate(String s) {


        s = s.replaceAll("\\s+", "");
        char[] a = s.toCharArray();
        int cal=0;
        for(int i=0;i<a.length;i++){

            for(int j=1;j<a.length;j++){
                System.out.println();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        BasicCalculator2 a = new BasicCalculator2();
        a.calculate(" 3+5 / 2 ");


    }
}
