package com.bootcoding.basic.leetcode;

public class IncreamentAndDecreament {

    public static void main(String[] args) {
        int a = 60;
        int n = 25 ;

        for(int i=1;i<=n;i++){

            int incr = a;
            int decs = a;

            incr = incr +i;
            decs = decs - i;

            System.out.print(incr+","+decs+",");


        }
    }
}
