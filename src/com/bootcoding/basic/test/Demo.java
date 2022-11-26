package com.bootcoding.basic.test;

class Check {

    private Check(){
        System.out.println("Hello");
    }

    public static Check  create(){

        return new Check();
    }

    public void print(){
        System.out.println("I'm in singleton class");
    }

}
public class Demo{
    public static void main(String[] args) {

        Check check =Check.create();

        check.print();
    }
}
