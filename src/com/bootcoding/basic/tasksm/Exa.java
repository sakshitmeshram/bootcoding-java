package com.bootcoding.basic.tasksm;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Exa {
    public static void main(String[] args) {
        String s = "tree";
        TreeMap<Character,Integer>treeMap = new TreeMap<>();
        char[] w = s.toCharArray();
        for (int i=0;i< w.length;i++){
            if (treeMap.containsKey(w[i])){
                treeMap.put(w[i],treeMap.get(w[i])+1);
            }
            else {
                treeMap.put(w[i],1);
            }
        }
        Comparator<Map.Entry<Character, Integer>> valueComparator = (e1, e2) -> e2.getValue().compareTo(e1.getValue());

// Creating a List object containing the Map.Entry objects from the TreeMap
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(treeMap.entrySet());

// Sorting the List object using the Comparator object
        Collections.sort(entryList, valueComparator);

// Creating a new TreeMap object to store the sorted Map.Entry objects
        TreeMap<Character, Integer> sortedMap = new TreeMap<>();
        String res="";
// Adding the sorted Map.Entry objects to the new TreeMap object
        for (Map.Entry<Character, Integer> entry : entryList) {
            if(entry.getValue()>1){
                for(int i=0;i< entry.getValue();i++){
                    res +=entry.getKey();
                }
            }
            else {
                res +=entry.getKey();
            }

        }

// Printing the sorted TreeMap object
        System.out.println(res);

    }
}
