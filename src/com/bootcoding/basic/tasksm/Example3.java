package com.bootcoding.basic.tasksm;

import java.util.Arrays;
<<<<<<< HEAD
import java.util.Optional;
=======
>>>>>>> origin/main

public class Example3 {

    public    int differenceOfSum(int[] nums) {
        int sumOfDigit =0;
        int sumOfElem=0;
        for(int i=0;i<nums.length;i++){
            int n =nums[i];
            if(n>10){
                sumOfElem=sumOfElem+add(n,0);
            }
            sumOfDigit=sumOfDigit+nums[i];
            sumOfElem=sumOfElem+nums[i];
        }
            return sumOfElem-sumOfDigit;
    }
    public int add(int num,int sum){

        if(num>0)
        {
            sum+=num%10;
            num/=10;
            add(num,sum);
        }
        return sum;

    }

    public static void main(String[] args) {
<<<<<<< HEAD
        int[] nums = {1, 15, 6, 3};
        Example3 r = new Example3();
        //  System.out.println(r.differenceOfSum(nums));

        String s="hello";
        char[] arr = s.toLowerCase().toCharArray();

=======
        int []nums = {1,15,6,3};
        Example3 r =new Example3();
        System.out.println(r.differenceOfSum(nums));
>>>>>>> origin/main
    }
}
