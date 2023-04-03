package com.bootcoding.basic.tasksm;

import java.util.HashMap;

public class Example5 {
    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        HashMap<Character , Integer> map = new HashMap<>();
        map.put('a',0);
        map.put('b',1);
        map.put('c',2);
        map.put('d',3);
        map.put('e',4);
        map.put('f',5);
        map.put('g',6);
        map.put('h',7);
        map.put('i',8);
        map.put('j',9);
        map.put('k',10);

        char[] firstW=firstWord.toCharArray();
        char[] secoW= secondWord.toCharArray();
        char[] targtW=targetWord.toCharArray();
        String f="";
        String s = "";
        String t="";
        for(char i: firstW){
            f +=map.get(i);
        }
        for(char j : secoW){
            s +=map.get(j);
        }

        for(char j : targtW){
            t +=map.get(j);
        }

        if(Integer.parseInt(f)+Integer.parseInt(s)==Integer.parseInt(t)){
            return true;
        }

        return  false;
    }

    public static void main(String[] args) {

        String firstWord="acb";
        String secondWord="cba";
        String targetW="cdb";

        System.out.println(isSumEqual(firstWord,secondWord,targetW));
    }
}
