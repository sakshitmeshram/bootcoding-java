/*
Enter String
        Search
        Enter word want to Searche
        or
        false
*/


package com.bootcoding.basic;

import java.util.Scanner;

public class SearchContail {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.next();

        System.out.println("Enter word want to Searche");
        String s =sc.next();

        if(str.contains(s)){

            System.out.println("true");
        }else{

            System.out.println("false");
        }
    }
}
