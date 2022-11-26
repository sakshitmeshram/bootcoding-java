package com.bootcoding.basic.test;

import java.util.Scanner;

public class NameSearche {

    public void search(String[] a,String input){

        int count =0;

        for(int i=0;i<a.length;i++){

            if(input.equals(a[i])){
                System.out.println("Found");

            }
            else {

//                count++;
                System.out.println();

            }

        }
        if(count==(a.length)){
            System.out.println("not found");
        }



    }

    public static void main(String[] args) {

        String[] a = {"ravi","ajay","komal","aswin","uddesh","rohan","ankit","sakshit"};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name here ");

        String input = sc.nextLine();

        NameSearche nameSearche = new NameSearche();
        nameSearche.search(a,input);

    }
}
