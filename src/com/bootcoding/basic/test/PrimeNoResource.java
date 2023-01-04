package com.bootcoding.basic.test;

import java.util.ArrayList;
import java.util.List;

public class PrimeNoResource {

    public List getPrimeNoList(int number){
        int count =0;
        List<Integer> list= new ArrayList<>();
        for(int i=1;i<=number;i++){

            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
             list.add(i)  ;

            }
            count=count*0;
        }
        return list;
    }


    public static void main(String[] args) {

        PrimeNoResource primeNoResource = new PrimeNoResource();
        List<Integer>list1;
        list1=  primeNoResource.getPrimeNoList(11);
        for(Integer i :list1){
            System.out.println(i);
        }

    }
}
