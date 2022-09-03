package com.bootcoding.basic;

import java.util.Arrays;
import java.util.TreeSet;

public class ArrayRelativeOrderToZero {
    public static void main(String[] args) {
        int[] b ={0,10,0,20,0,30,0};
        moveZeroes(b);
    }


       public static void moveZeroes(int[] a) {

           for(int i=0;i<a.length;i++) {
               for (int j = 0; j < a.length; j++) {

                   if (j == a.length - 1) {
                       break;
                   }

                   if (a[j] == 0) {
                       int temp = a[j + 1];
                       a[j + 1] = a[j];
                       a[j] = temp;
                   }

               }
           }

        for(int ii : a){

            System.out.print("[ "+ii+" ]");
        }

       }
       }



