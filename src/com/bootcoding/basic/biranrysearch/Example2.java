package com.bootcoding.basic.biranrysearch;

public class Example2   {
    public static void  judgeSquareSum(int c) {
        int count =0;
        for(int i=0;i<c;i++){
            int sqt1=i*i;
            int sqt2=(i+1)*(i+1);
            int total=sqt1+sqt2;
            if(c==total){
                System.out.println("treu::"+total);
            }
            else
                System.out.println("false"+total);
        }

    }

    public static void main(String[] args) {
        int c=4;
      judgeSquareSum(c);
    }
}
