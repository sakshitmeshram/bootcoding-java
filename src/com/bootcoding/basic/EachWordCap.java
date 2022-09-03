package com.bootcoding.basic;

public class EachWordCap {

    public static void main(String[] args) {
        String text = "Go is an open source programming language supported by Google";

        String[]  str = text.split("\\s");

        for(String s : str){

            String first =  s.substring(0,1).toUpperCase();
            String second = s.substring(1,s.length()).toLowerCase();

            String cobine =first+second;
            System.out.print(cobine+" ");
        }
    }
}
