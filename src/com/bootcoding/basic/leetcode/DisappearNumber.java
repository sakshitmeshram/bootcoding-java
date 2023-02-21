package com.bootcoding.basic.leetcode;

import java.util.*;

public class DisappearNumber {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>list=new ArrayList<>();
        for (int element : nums)
        {
            if(map.get(element) == null)
            {
                map.put(element, 1);
            }
            else
            {
                map.put(element, map.get(element)+1);
            }
        }
        Set<Integer> set1 = map.keySet();
        int j=1;
        for(Integer integer :set1){
            if(j!=integer){
                list.add(j);
            }
            j++;
        }
        return list;
    }

    public static void main(String[] args) {
        int num[]={3,3};
        for (Integer i :findDisappearedNumbers(num)){
            System.out.println(i);
            //448
        }
    }
}
