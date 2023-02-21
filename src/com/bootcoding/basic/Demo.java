package com.bootcoding.basic;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static int findKthPositive(int[] arr, int k) {
        List<Integer> list=new ArrayList<>();
        List<String>list1=new ArrayList<>();

        for(int i=1;i<(arr[arr.length-1]+10);i++){
            int count=0;
            for(int j=0;j< arr.length;j++){
                if(i==arr[j]){
                    count++;
                }
            }
            if(count==0){
                list.add(i);
            }
        }
        return list.get(k-1);
    }
    public static void main(String[] args) {
        int []a ={5,6,7,8,9};
        int k=9;
        System.out.println(findKthPositive(a,k));

    }
}
