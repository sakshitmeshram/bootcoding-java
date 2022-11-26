package com.bootcoding.basic.test;

public class SortName {

    public String[] sort(String[] a){

        int n = a.length;

        for(int i=0; i<n-1;i++){

            for(int j=i+1;j<n;j++){

                if(a[i].compareTo(a[j])>1){
                    String temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        return a;

    }
    public static void main(String[] args) {
        String[] a = {"ravi","ajay","komal","aswin","uddesh","rohan","aankit","sakshit"};

        SortName sortName = new SortName();

        for(String s :sortName.sort(a)){
            System.out.println(s);
        }
    }
}
