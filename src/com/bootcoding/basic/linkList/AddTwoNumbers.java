package com.bootcoding.basic.linkList;

public class AddTwoNumbers {
    public Node addTwoNumbers(Node l1, Node l2) {
        Node temp=l1;
        String s1="";
        while(temp!=null){
            s1 +=temp.data;
            temp=temp.next;
        }

        Node temp2=l1;
        String s2="";
        while(temp2!=null){
            s2 +=temp2.data;
            temp2=temp2.next;
        }

        int n1=Integer.parseInt(s1);
        int n2=Integer.parseInt(s2);

        String val=String.valueOf(n2+n1);
        char [] m=val.toCharArray();



        return null;

    }
}
