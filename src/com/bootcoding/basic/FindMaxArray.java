package com.bootcoding.basic;

public class FindMaxArray {
    public static void main(String[] args) {
        int[] a ={21,31,12,52,49,23};
        int max=a[0];

        for (int j : a) {
            if (max < j) {
                max = j;
            }
        }
        System.out.println(max);

    }
}
