package com.bootcoding.java8;

public class Driver implements Bike{


    @Override
     public void run() {
        System.out.println("Implemented methods");
        Bike bike=Bike.bike;
        System.out.println(bike);
    }


}
