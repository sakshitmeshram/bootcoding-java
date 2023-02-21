package com.bootcoding.basic.biranrysearch;

public class Example1 {

    public static int[] search(int num[], int key){
        int low=0;
        int high=num.length-1;
        int a[] = new int[3];
        int count =0;
        while(low<=high){

            int mid = (low + high)/2;
            if (key==num[mid ]){
/*
                a[count]=mid;
                count++;*/
            }
            else if(key>num[mid]){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int num[]={5,7,7,8,8,10};
        for(Integer o :search(num,8)) {
            System.out.println(o);

        }


    }
}
