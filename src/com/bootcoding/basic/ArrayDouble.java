package com.bootcoding.basic;

public class ArrayDouble {
    public static void main(String[] args) {
        int a[] = {3,1,2};
        ArrayDouble b=new ArrayDouble();
        b.getConcatenation(a);

    }
    public void getConcatenation(int []a){

        for(int i=0;i<2;i++){
            for(int j=0;j<a.length;j++){

                System.out.println(a[j]);
            }

        }


    }

}
