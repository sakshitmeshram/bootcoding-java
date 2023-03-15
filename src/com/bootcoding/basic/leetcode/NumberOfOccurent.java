package com.bootcoding.basic.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NumberOfOccurent {
    public static boolean areOccurrencesEqual(String s) {

        char[] str = s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length;i++) {
            if (map.containsKey(str[i])) {
                map.put(str[i], map.get(str[i]) + 1);
            } else {
                map.put(str[i], 1);
            }
        }
        int count=map.get(str[0]);
        Set<Character> keys = map.keySet();
        for (Character ch : keys) {
            if (count!=map.get(ch)) {
                return  false;
            }
        }
       return true;
    }

    public static void main(String[] args) {
        String s="aaabb";
        System.out.println(areOccurrencesEqual(s));
    }
}
