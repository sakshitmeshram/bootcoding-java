package com.bootcoding.basic.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumNumberOfWordsFoundInSentences {
    public static int mostWordsFound(String[] sentences) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<sentences.length;i++){
            String []s=sentences[i].split(" ");
            list.add(s.length);
        }
        Collections.sort(list);
        return list.get(list.size()-1);
    }

    public static void main(String[] args) {
        String s[] ={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(s));;
    }
}
