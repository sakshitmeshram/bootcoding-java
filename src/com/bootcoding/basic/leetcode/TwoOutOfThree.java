package com.bootcoding.basic.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoOutOfThree {

        public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
            Map<Integer,Integer> map=new HashMap<>();
            List<Integer>list=new ArrayList<>();
            for(int i=0;i<nums1.length;i++){
                if(map.containsKey(nums1[i])){
                    map.put(nums1[i],map.get(nums1[i])+1);
                }else{

                    map.put(nums1[i],i);
                }

            }
            for(int j=0;j<nums2.length;j++){
                if(map.containsKey(nums2[j])){
                    map.put(nums2[j],map.get(nums2[j])+1);
                }else{

                    map.put(nums2[j],j);
                }

            }
            for(int k=0;k<nums3.length;k++){
                if(map.containsKey(nums3[k])){
                    map.put(nums3[k],map.get(nums3[k])+1);
                }else{

                    map.put(nums3[k],k);
                }

            }
            for(int l=0;l<nums1.length;l++){
                if(map.get(nums1[l])>1){
                    list.add(nums1[l]);
                }
                if(map.get(nums2[l])>1){
                    list.add(nums2[l]);
                }
            }
            return list;
        }

    public static void main(String[] args) {
        TwoOutOfThree twoOutOfThree=new TwoOutOfThree();
        int nums1[]={3,1};
        int nums2[]={2,3};
        int nums3[]={1,2};
        List<Integer>list=twoOutOfThree.twoOutOfThree(nums1,nums2,nums3);

        for(Integer i:list){
            System.out.println(i);
        }
    }

}
