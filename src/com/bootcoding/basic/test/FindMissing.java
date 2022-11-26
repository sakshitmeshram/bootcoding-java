package com.bootcoding.basic.test;

public class FindMissing {

    public  int sortedArray(int[] a){

            int n=a.length;
        int sum = (n*(n+1)) / 2;
        for (int i = 0; i < n; i++)
            sum -= a[i];
        return sum;
    }

    public static void main(String[] args) {
        FindMissing findMissing = new FindMissing();

        int[] a={1,2,3,4,6,7};

        System.out.println(findMissing.sortedArray(a));;
    }
}
