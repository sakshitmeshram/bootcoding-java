package com.bootcoding.basic.test;

public class ArrayDuplicate {

    public static int Search(String[]a){
        int count=0;
        for(int i=0;i<a.length-1;i++){

            String input=a[i];

            for(int j=i+1;j<a.length;j++){

                if(input.equals(a[j]) ){
                    a[j]="0";
                }
            }
        }
        for(String s : a){
            if(s=="0"){
                count++;
            }
        }


        return a.length-count;
    }

    public static void main(String[] args) {

        String []a = {"ajay","ajay","vijay","ashwin","ramesh","ashu","rajesh","ashu","vijay","uddesh","vinod","raj","bakarans"};

        int num = ArrayDuplicate.Search(a);

        System.out.println(num);
    }
}
