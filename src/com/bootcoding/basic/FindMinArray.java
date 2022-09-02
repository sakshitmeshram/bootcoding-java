package com.bootcoding.basic;

public class FindMinArray {
    public static void main(String[] args) {
        int a[]={21,31,12,52,49,23};
        int min=a[0];

        for (int j : a) {
            if (min > j) min = j;
        }
        System.out.println(min);
    }
}
