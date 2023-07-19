package com.bootcoding.basic.tasksm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DistinctString {
    public static String kthDistinct(String[] arr, int k) {
        Map<String,Integer> map =new HashMap<>();
        for(String s : arr){
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }
            else{
                map.put(s,1);
            }
        }
        List<String> list = new ArrayList<>();
        int count =0;
        for(String s : arr){
            if(map.get(s)==1){
                list.add(s);
                count++;
            }
        }
        if(count==map.size()){
            return arr[k-1];
        }
        if(list.size()<k){
            return "";
        }
        return list.get(k-1);
    }

    public static void main(String[] args) {
        String[] s={"a","b","a"};
        int k =2;
        System.out.println(kthDistinct(s,k));
    }
}
