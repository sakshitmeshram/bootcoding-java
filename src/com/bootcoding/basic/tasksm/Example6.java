package com.bootcoding.basic.tasksm;

import com.bootcoding.basic.linkList.Node;

import java.util.ArrayList;
import java.util.List;

public class Example6 {

    public static String replaceWords(List<String> dictionary, String sentence) {

        String s[] =sentence.split(" ");
        String res="";
        for(int i=0;i<s.length;i++){

            for(int j=0;j<dictionary.size();j++){

                if(s[i].startsWith(dictionary.get(j))){
                    s[i]=dictionary.get(j);

                }
            }
        }
        for(String i:s){
            res +=i+" ";
        }
        return res.trim();

    }

    public static void main(String[] args) {
        String s="the cattle was rattled by the battery";
        List<String >list= new ArrayList<>();
        list.add("cat");
        list.add("bat");
        list.add("rat");

        System.out.println(replaceWords(list,s));
        System.out.println((int)Math.pow(3,0));

        int res=0;
        for(int i=1;i<91/2;i++){
            res =(int) Math.pow(3,i);
            System.out.println(res);
        }

    }
}
