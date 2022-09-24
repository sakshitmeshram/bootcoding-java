package com.bootcoding.basic.leetcode;

public class SearchAndInsertion {

    public void search(int[] num ,int  target){

        int n = num.length;

        for (int i=0;i<n;i++){
            if(num[i]==target){
                System.out.println(i);
                break;
            }
            else if(num[i]>target){
                System.out.println(i);
                break;
            }
            System.out.println(n);
            break;
        }

    }

    public static void main(String[] args) {
        int [] num = {1,2,3,5};
        int target=4;
        SearchAndInsertion s1  = new SearchAndInsertion();
        s1.search(num,target);
    }
}
