package com.bootcoding.basic.leetcode;

public class DefangingAnIPAddress {
    public static String defangIPaddr(String address) {
        address.toLowerCase();
        String s[] =address.split("");
        String s1="";
        for(int i=0;i<s.length;i++){
            if(s[i].equals(".")){
                s[i]="[.]";
            }
            s1+=s[i];
        }

        return s1;

    }

    public static void main(String[] args) {
        String s="1.1.1.1";
        System.out.println(defangIPaddr(s));;
    }
}
