// OUTPUT sentence = 8


package com.bootcoding.basic;

public class LastWordLength {
    public static void main(String args[]) {
        String lastWordStr = "Last word in a sentence";

        String [] str = lastWordStr.split("\\s");

        String s1  = str[str.length-1];

        int con =s1.length();

        System.out.println(con);



    }
}
