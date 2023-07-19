package com.bootcoding.basic.linkList;

public class AddTwoNumbers2 {
    public Node addData(){
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(6);


        Node head=n1;
        n1.next=n2;
        n2.next=n3;
        return  head;
    }
    public Node addData1(){
        Node n1=new Node(2);
        Node n2=new Node(4);
        Node n3=new Node(6);


        Node head=n1;
        n1.next=n2;
        n2.next=n3;
        return  head;
    }
    public void addTwoNumbers(Node l1, Node l2) {
        Node temp1 = l1;
        String sl1="";
        while (temp1!=null){
            sl1 +=temp1.data;
            temp1=temp1.next;
        }

        Node temp2 = l2;
        String sl2="";
        while (temp2!=null){
            sl2 +=temp2.data;
            temp2=temp2.next;
        }

        String s= String.valueOf(Integer.valueOf(sl1)+Integer.valueOf(sl2));


    }

  /*  public Node createNode(String s){
        Node step = new Nod;
        Node res = step;

        for (int i = 0; i < s.length(); i++){
            step.next = new Node(s.charAt(i) - 48);
            step = step.next;
        }

        return res.next;
    }*/

    public static void main(String[] args) {

        AddTwoNumbers2 addTwoNumbers2 = new AddTwoNumbers2();
        Node h=addTwoNumbers2.addData();
        Node h2 = addTwoNumbers2.addData1();

        addTwoNumbers2.addTwoNumbers(h, h2);
    }
}
