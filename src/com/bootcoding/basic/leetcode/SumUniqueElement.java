package com.bootcoding.basic.leetcode;

import java.util.*;

public class SumUniqueElement {

    public static void sumElement(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int element : arr)
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

        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        int sum=0;
        for (Map.Entry<Integer, Integer> entry : entrySet)
        {

            if(entry.getValue()==1)
            {
                sum=sum+ entry.getKey();
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        int num[]={10,6,9,6,9,6,8,7};
        sumElement(num);
    }
}
