package com.bootcoding.basic.tasksm;

import java.util.*;

public class Mapper {




    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
       /* int n=0;
        int a[] = new int[arr1.length];
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    a[n]=arr1[j];
                    arr1[j]=0;
                    n++;
                }
            }
        }

        for(int i: arr1){
            if(i!=0){
              a[n]=i;
                n++;
            }
        }

        return a;*/
        Map<Integer,Integer>map=new HashMap<>();
        List<Integer> st2=new ArrayList<>();

        for(int i:arr2){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }
        for(int i:arr1){
            if(map.containsKey(arr1[i]))
            {
                if(!map.containsKey(arr1[i]))map.put(arr1[i],1);
                else map.put(arr1[i],map.get(arr1[i])+1);
            }
             else st2.add(arr1[i]);
        }
        Collections.sort(st2);

        int index=0;

        if(map.size()>=1)
        {
            for(int i=0;i<arr2.length;i++){

                for(int j=0;j<map.get(arr2[i]);j++){

                    arr1[index++]=arr2[i];

                }

            }
        }

        for(int i=0;i<st2.size();i++){
            arr1[index++]=st2.get(i);
        }



        return arr1;



    }


    public static void main(String[] args) {
        int arr1[] = {2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31};
        int arr2[] = {2,42,38,0,43,21};
        for(int i: relativeSortArray(arr1,arr2)){
            System.out.println(i);
        }
    }

    }
