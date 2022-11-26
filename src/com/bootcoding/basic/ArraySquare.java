package com.bootcoding.basic;

import java.util.Arrays;

public class ArraySquare {

    public static void main(String[] args) {

            int num [] = {-4, 3, 2, 7, -4};

            /*int con=0;


            for (int i=0;i<num.length;i++){
                    int var=num[i];

                   if( var < num[i] ){
                       var = num[i];
                       num[i+1] = var;
                   }

                    for (int j=i;j<=i;j++) {
                        con = num[i] * num[j];

                    }

            }*/
        Arrays.sort(num);
            for(int x :num){
                System.out.println(x);
            }

    }
}
