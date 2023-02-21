package com.bootcoding.basic.leetcode;

public class OperationCount {
    public int finalValueAfterOperations(String[] operations) {
        int sum=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("--X") || operations[i].equals("X--")){
                sum=sum-1;
            }
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                sum=sum+1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        OperationCount o = new OperationCount();
        String[] n={"--X","X++","X++"};
        int num=o.finalValueAfterOperations(n);
        System.out.println(num);
    }
}
