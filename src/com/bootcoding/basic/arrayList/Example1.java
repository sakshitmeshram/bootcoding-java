package com.bootcoding.basic.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Example1 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(4);
        list.add(3);
        list.add(7);
        list.add(5);

        Collections.sort(list);

        for (Integer in : list)
              {
                  System.out.println(in);
        }

    }

}
