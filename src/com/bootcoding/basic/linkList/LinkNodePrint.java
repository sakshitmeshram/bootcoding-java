package com.bootcoding.basic.linkList;

public class LinkNodePrint {

    public class Node {

        int data;
        Node next;
        public Node(int d){
            data=d;
            next = null;
        }
    }

   public  Node addData(){
       Node n1=new Node(10);
       Node n2=new Node(20);
       Node n3=new Node(30);
       Node n4=new Node(40);
       Node n5=new Node(50);
       Node n6=new Node(70);

       Node head=n1;
       n1.next=n2;
       n2.next=n3;
       n3.next=n4;
       n4.next=n5;
       n5.next=n6;
       n6.next=null;

       return head ;
   }

   public static void printData(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.next.data);
            temp=temp.next;
        }
   }

   public  Node addNode(Node head){
        Node node =new Node(5);
        Node temp=head;

        node.next=temp;
        head=node;
       Node temp2=head;
        while (temp2!=null){
            System.out.println(temp2.data);
            temp2=temp2.next;
        }
        return head;
   }

   public Node addNodeAtLast(Node head){
       Node node =new Node(80);
       Node temp=head;
       while (temp!=null){
           if(temp.next==null){
               temp.next=node;
               node.next=null;
           }
           temp=temp.next;
       }
       return head;
   }

    public static void main(String[] args) {

        LinkNodePrint linkNodePrint =new LinkNodePrint();
        Node h=linkNodePrint.addData();
        Node head=linkNodePrint.addNodeAtLast(h);
        printData(head);


    }
}
