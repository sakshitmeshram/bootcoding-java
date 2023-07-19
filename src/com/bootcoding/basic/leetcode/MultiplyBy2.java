package com.bootcoding.basic.leetcode;

public class MultiplyBy2 {
    public static int findFinalValue(int[] nums, int original) {
        for(int i=0;i<nums.length;i++){
            if(search(original,nums)){
                original=original*2;
            }
        }
        return original;
    }
    public static boolean search(int a , int []s){
        for(int i=0;i<s.length;i++){
            if(a==s[i]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a= {8,19,4,2,15,3};
        int s=2;

        System.out.println(findFinalValue(a,s));
    }
}
