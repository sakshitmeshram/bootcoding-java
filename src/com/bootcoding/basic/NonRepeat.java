/*enter word
        bootcoding
        b 0*/


package com.bootcoding.basic;

import java.util.Scanner;

public class NonRepeat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter word");
        String word = sc.next();

        int count =0;
        for(char ch : word.toCharArray()){

            if(word.indexOf(ch)==word.lastIndexOf(ch)){

                System.out.println(ch +" "+ count);
               break;
            }else{

                count++;
            }

        }

    }
}
