package com.bootcoding.basic.linkList;
import java.io.*;
import java.util.LinkedList;

public class Example1 {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }

    }

    public void display() {
        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Example1 example1 = new Example1();

        example1.addNode(1);
        example1.addNode(2);
        example1.addNode(3);
        example1.addNode(5);
        example1.addNode(5);
        example1.addNode(6);
        example1.addNode(7);

        example1.display();



    }
}
