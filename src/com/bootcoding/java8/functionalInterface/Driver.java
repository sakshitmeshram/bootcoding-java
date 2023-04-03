package com.bootcoding.java8.functionalInterface;

public class Driver {
    public static void main(String[] args) {

         Bike bike =() -> System.out.println("lambda expression");
         bike.run();
    }

}
