package com.bootcoding.basic.leetcode;

public class TriangleSumOfArray {
    public static int triangularSum(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int a[] = new int[nums.length];
        for(int i=0;i<nums.length-2;i++){
            a[i]=nums[i]+nums[i+1];
        }
        return triangularSum(a);
    }

    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        System.out.println(triangularSum(a));
    }
}
