package com.bootcoding.basic.leetcode;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArrayBySign {
    public static void rearrangeArray(int[] nums) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                list.add(nums[i]);
            }
            else {
                list.add(nums[i]);
            }
        }
        for(Integer i:list){
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        int a[]={3,1,-2,-5,2,-4};
        rearrangeArray(a);
    }
}
