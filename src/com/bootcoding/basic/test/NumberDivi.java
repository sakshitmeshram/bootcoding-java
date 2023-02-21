package com.bootcoding.basic.test;

import java.util.ArrayList;
import java.util.List;

public class NumberDivi {

    public static void checkDivi(int n){
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=1;i<n;i++){
            if(n/i==0){
                list.add(i);
            }
        }

        for (Integer i:list) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        checkDivi(121);
    }
}
