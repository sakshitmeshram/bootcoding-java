package com.bootcoding.java8.functionalInterface;

public interface Bike {

   public  void run();
    default void fly(){
        System.out.println("default methods");
    }
    static void fast(){
        System.out.println("static method");
    }
}
