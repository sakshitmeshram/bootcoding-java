package com.bootcoding.basic;

public class ArraySwap {
    public static void main(String[] args) {
        int a[]={21,31,12,52,49,23};
        int con=a[0];

            for (int i=0;i<a.length;i++){
                a[0]=a[a.length-1];
                a[a.length-1]=con;
                System.out.println(a[i]);
            }
    }
}
