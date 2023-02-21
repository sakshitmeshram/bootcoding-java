package com.bootcoding.basic.leetcode;

public class TriangularSum {
    public static int triangularSum(int[] nums) {

        for(int i=0;i<nums.length;i++){
            int[] a=nums;
             a=sum(a);
            if (a.length==1){
                return a[0];
            }
        }
        return 0;
    }
    public static int[] sum(int [] nums ){
        int[] a =new int[nums.length-1];
        for (int i=1;i< nums.length;i++){
            int first=nums[i-1];
            int second=nums[i];
            a[i-1]=first+second;
        }
        return a;
    }

    public static void main(String[] args) {
        int n[]={1,2,3,4,5};
        triangularSum(n);
    }
}
