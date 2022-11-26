package com.bootcoding.basic.test;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer>list = new ArrayList<>();
        for(int i=left;i<=right;i++){


            String number = String.valueOf(i);

            char[] ch = number.toCharArray();

            for(int j=0;j<ch.length;j++){


                if(ch[j]!=0 ||  i%ch[j]==0){

                    list.add(i);
                }
            }

        }

        return list;
    }

    public static void main(String[] args) {

        int left =47;
        int right=85;

        SelfDividingNumbers selfDividingNumbers = new SelfDividingNumbers();

        List<Integer>no =selfDividingNumbers.selfDividingNumbers(left,right);

        for(Integer ii :no){
            System.out.println(ii);
        }
    }
}
