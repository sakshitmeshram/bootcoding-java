package com.bootcoding.basic;

public class SumArrayElement {

    public static void main(String[] args) {
        int a[]={1,4,1,7,9};
        SumArrayElement s1 = new SumArrayElement();
        s1.getRunningSum(a);

    }

    public void getRunningSum(int []a){
        int con;
        for (int i=1;i<a.length;i++){
            con=a[i]+a[i-1];
            a[i]=con;
        }

        for (int x:a){
            System.out.println(x);
        }


    }

}
