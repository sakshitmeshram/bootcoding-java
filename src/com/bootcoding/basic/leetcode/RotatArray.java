package com.bootcoding.basic.leetcode;

import java.util.ArrayList;
import java.util.List;

public class RotatArray {

    //output is [5,6,7,1,2,3,4]
    public void perform(int arr[],int k ){
        int n =arr.length;

        // revers array to {7,6,5,4,3,2,1}
        for(int i=0;i<arr.length/2;i++){
            int count = arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=count;
        }

        for(int i=0;i<k/2;i++){
            int count = arr[i];
            arr[i]=arr[k-1-i];
            arr[k-1-i]=count;
        }
        // revers array to {7,6,5,4,3,2,1}
        for(int i=0;i<(n-k)/2;i++){

            int count =arr[k+i];
            arr[k+i]=arr[n-1-i];
            arr[n-1-i]=count;

        }




        for (int x: arr){
            System.out.println(x);
        }


    }

    public static void main(String[] args) {
        int [] n = {1,2,3,4,5,6,7 , 8 ,9 ,10,12};
        int k =5;
        RotatArray rotatArray = new RotatArray();
        rotatArray.perform(n,k);
    }
}
