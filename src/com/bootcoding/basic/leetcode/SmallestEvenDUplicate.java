package com.bootcoding.basic.leetcode;

import java.util.*;

public class SmallestEvenDUplicate{
    public static int  mostFrequentEven(int[] nums) {
        System.out.println(nums.length);
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
               int  count = map.get(nums[i]);
                map.put(nums[i], count + 1);
            }
            else{
                map.put(nums[i], 1);
            }

        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>1 && nums[i]%2==0){
                list.add(nums[i] );
            }
        }
        if(list.size()==0){
            return -1;
        }
        return list.get(0);

    }

        public static void main(String[] args) {
            int[] a={4};
            System.out.println(mostFrequentEven(a));
        }
}
