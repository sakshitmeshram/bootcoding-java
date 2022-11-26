package com.bootcoding.basic;

public class CheckValidString {

    public static void main(String[] args) {


         String s = "i am bootcodng";
         int lan = s.length();
          char[] con = s.toCharArray();

         for (int i=0;i<lan;i++){

             for (int j=1;j<lan;j++){
               if( con[i]==con[j]){

                   System.out.println(con[i]);
                    break;
               }


             }

         }

    }
}
