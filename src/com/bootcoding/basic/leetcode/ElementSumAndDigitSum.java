package com.bootcoding.basic.leetcode;

public class ElementSumAndDigitSum {
    public static int differenceOfSum(int[] nums) {
        int sumElement=0;
        int sumDigit=0;
        for(int i=0;i<nums.length;i++){
            sumElement=sumElement+nums[i];
            sumDigit=sumDigit+checkDigit(nums[i],0);
        }

        return sumElement-sumDigit;

    }
    public static int checkDigit(int n,int s){
        while (n==0){
            return s;
        }
        s=s+n%10;
        int res=n/10;
        return checkDigit(res,s);
    }

    public static void main(String[] args) {
        int nums[] ={1,2,3,4};
        System.out.println(differenceOfSum(nums));
    }
}
