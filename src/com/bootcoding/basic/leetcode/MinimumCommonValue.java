package com.bootcoding.basic.leetcode;

import java.util.LinkedHashMap;

public class MinimumCommonValue {
    public static int getCommon(int[] nums1, int[] nums2) {
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                map.put(nums1[i],map.get(nums1[i])+1);
            }
            map.put(nums1[i],1);
        }
        for(int j:nums2){
            if(map.containsKey(j)){
                map.put(j, map.get(j) + 1);
            }
            else {
                map.put(j,1);
            }

        }

        for (int k:nums1){
            if(map.get(k)>1){
                return k;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b={2,4,5,6};
        System.out.println(getCommon(a,b));
    }
}
