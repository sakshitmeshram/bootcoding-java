package com.bootcoding.basic.leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicateElement {
    public static void main(String[] args) {

        int a[] = {1,2,3,2,4,5,2,43,2,2};
        int tar = 2 ;
     double x = System.currentTimeMillis();
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int i :a){

           /* if(map.containsKey(i)){

                map.put(i,1+1);
            }else{
                map.put(i,1);
            }*/
            map.put(i,1);
        }

       if( map.containsKey(tar)){

           map.remove(tar);
        }



        for(Map.Entry<Integer,Integer> m : map.entrySet()){

            System.out.println(m.getKey());

        }
        System.out.println(System.currentTimeMillis()-x +" MS");









       /* for (int i=0;i<a.length;i++){

            if (a[i]==tar){
                a[i]=a[i]-tar;
            }
            System.out.println(a[i]);
        }
        for (int j=0;j<a.length;j++){

            if (a[j]==0){
                a[j]=a[j+1];
            }
            System.out.println(a[j]);
        }
        for (int x:a){

            System.out.print(x);
        }*/

    }
}
