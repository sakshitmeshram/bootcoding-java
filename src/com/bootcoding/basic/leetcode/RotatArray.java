package com.bootcoding.basic.leetcode;

import java.util.ArrayList;
import java.util.List;

public class RotatArray {

    public void perform(int arr[],int k ){
            int n= arr.length;
        List<Integer>list = new ArrayList<>();
        List<Integer>list1 = new ArrayList<>();



        for(int i=0;i<n;i++){
            if(i<k){
            list.add(new Integer(arr[i]));
            }
            else {

                list1.add(new Integer(i));
            }
        }

        /*for(int i=0;i<n;i++){
            int j=0;
            if(i<k){
                arr[i]=b[i];
            } else {
                arr[i]=a[(n-k)+j];
                j++;
            }
        }*/
        for(int x : list){
            System.out.println(x);
        }
        for(int cor : list1){
            System.out.println(cor);
        }

    }

    public static void main(String[] args) {
        int [] n = {1,2,3,4,5,6,7};
        int k =3;
        RotatArray rotatArray = new RotatArray();
        rotatArray.perform(n,k);
    }
}
