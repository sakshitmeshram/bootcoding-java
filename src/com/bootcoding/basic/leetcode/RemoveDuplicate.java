package com.bootcoding.basic.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RemoveDuplicate {
    public static int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int a=0;
        for(Map.Entry m : map.entrySet()){

        }
        return map.size();
    }

    public static void main(String[] args) {
        int[] a = {1,1,2};
        System.out.println(removeDuplicates(a));
    }
}
