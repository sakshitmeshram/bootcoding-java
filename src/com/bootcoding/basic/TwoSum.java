 package com.bootcoding.basic;

public class TwoSum {

         int a[]={1,2,3,4,5,6,7,8,9};
            int count;
            int target = 10;


        public void getSum(){
             for (int i=0;i<a.length;i++){

                 for (int j=0;i<a.length;i++) {
                     if (a[i] + a[j] == target) {
                          count++;
                         System.out.println("pairs[] "+a[i]+" "+a[j]);
                         /*System.out.println(a[j]);*/
                     }


                 }

             }
            System.out.println("Here paires occures "+count);

    }

    public static void main(String[] args) {
        TwoSum a1 = new TwoSum();
        a1.getSum();
    }
}

