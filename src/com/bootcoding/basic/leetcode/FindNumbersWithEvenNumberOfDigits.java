package com.bootcoding.basic.leetcode;

public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int n=checkDigit(nums[i],0);
            if(n%2==0){
                count++;
            }
        }
        return count;
    }
    public int checkDigit(int n ,int c){
        while (n==0){
            return c;
        }
        int sum=n%10;
        int res=n/10;
        c++;
        return checkDigit(res,c);
    }

    public static void main(String[] args) {
        FindNumbersWithEvenNumberOfDigits f = new FindNumbersWithEvenNumberOfDigits();
        int num[]= {555,901,482,1771};
      int n=  f.findNumbers(num);
        System.out.println(n);
    }
}
