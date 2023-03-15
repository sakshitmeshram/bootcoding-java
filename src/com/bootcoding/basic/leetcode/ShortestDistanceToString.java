package com.bootcoding.basic.leetcode;

public class ShortestDistanceToString {
    public static int closetTarget(String[] words, String target, int startIndex) {
        int countOfLeft=0;
        for(int i=startIndex;i<words.length;i++){
            if(target==words[i]){
                countOfLeft++;
            }
        }
        int countOfRight=0;
        for(int i=words.length-1;i>=0;i--){
            if(words[i]==target){
                countOfRight++;
            }
        }
        if(countOfRight>countOfLeft){
            return countOfLeft;
        }
        else if(countOfRight==0 && countOfLeft==0){
            return -1;
        }
        else{
            return countOfRight;
        }

    }

    public static void main(String[] args) {
        String [] word={"hello","i","am","leetcode","hello"};
        String target="hello";
        int sat=1;
        System.out.println(closetTarget(word, target,sat));
    }
}
