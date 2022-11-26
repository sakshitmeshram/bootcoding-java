package com.bootcoding.basic.arrayList;

public class FindDuplicate {
    public static void main(String[] args) {

        int a[] = {10,20,30,30,10,10,40,50};
        int count=0;
        int con=0;
        for (int i=0;i<=a.length;i++){



                if (a[i]==a[i+1]){

                    count++;
                    con = a[i];
                }

        }
        if (count!=0){
            System.out.println(con);
        }
    }
}
