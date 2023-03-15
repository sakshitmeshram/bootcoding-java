package com.bootcoding.basic.leetcode;

public class GretestSum {
    public static int maxSumDivThree(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            int sum=0;
            for(int j=0;j<nums.length;j++){

                    sum=sum+nums[j];

            }
            if(sum%3==0){
                return sum;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int num[]={2,6,2,2,7};
        System.out.println(maxSumDivThree(num));
    }
}
