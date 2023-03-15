package com.bootcoding.basic.leetcode;

import java.util.ArrayList;
import java.util.List;

public class InsercertionOfArray {

        public void intersect(int[] nums1, int[] nums2) {
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<nums1.length;i++){
                for(int j=0;j<nums2.length;j++){
                    if(nums1[i]==nums2[j]){
                        list.add(nums1[i]);
                        break;
                    }
                }
            }
        }

    public static void main(String[] args) {
        int a[] ={1,2,2,1};
        int b[] ={2};

        InsercertionOfArray insercertionOfArray = new InsercertionOfArray();
        insercertionOfArray.intersect(a,b);
    }
}
