package com.bootcoding.basic.arrayList;

 class Demo {
     public static String firstPalindrome(String[] words) {
         for(int i=0;i<words.length;i++){
             String s=reversString(words[i]);
            if(words[i].equals(s)){
                System.out.println(s);
                return words[i];
            }

         }

    return "";
     }
     public static String reversString(String s){
         char[] a=s.toCharArray();
         String s1="";
         for(int i=a.length-1;i>=0;i--){
             s1+=a[i];
         }
         return s1;
     }

     public static void main(String[] args) {
         String[] a={"def","ghi"};
         System.out.println(firstPalindrome(a));
     }
 }
