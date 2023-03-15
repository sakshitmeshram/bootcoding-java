package com.bootcoding.basic.test;

import java.util.HashMap;
import java.util.Set;

public class SingleNumber {

    public int solution(int [] nums){
        HashMap<Integer, Integer> map = new HashMap<>();

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

        Set<Integer> keys = map.keySet();
        for (Integer rs : keys) {
            if (map.get(rs)==1) {
                return rs;
            }
        }
        return 0;
    }
}
