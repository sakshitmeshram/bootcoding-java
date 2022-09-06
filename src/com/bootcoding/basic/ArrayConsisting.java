package com.bootcoding.basic;

public class ArrayConsisting {

    public int[] getS(int[] nums) {
        int b[]=new int[nums.length];
        int k=0;
        int n=nums.length/2;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
           b[i]=nums[i-k];
                k++;
            } else {
           b[i]=nums[n];
           n++;
            }

        }

        return b;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 6, 7, 1};
        ArrayConsisting e = new ArrayConsisting();
        int [] nums1=e.getS(nums);
        for(int x:nums1){
            System.out.println(x);
        }
    }

}


