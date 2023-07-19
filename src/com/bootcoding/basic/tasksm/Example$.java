package com.bootcoding.basic.tasksm;

import com.bootcoding.basic.Array;

import java.util.*;

public class Example$ {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet();
        HashSet<Integer> set2=new HashSet();

        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            set2.add(nums2[j]);
        }
        ArrayList<Integer> list = new ArrayList();
        Iterator<Integer> i=set1.iterator();
        Iterator<Integer> j=set2.iterator();
        for (Integer k : set1) {
            if (set2.contains(k)) {
                list.add(k);
            }
        }

        int res[] = new int[list.size()];
        int k=0;
        for(int s: list){
            res[k]=list.get(k);
            k++;
        }
        return res;
    }

    public static void main(String[] args) {

        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        for (int i : intersection(nums1,nums2)){
            System.out.println(i);
        }
    }
}
