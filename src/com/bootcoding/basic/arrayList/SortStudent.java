package com.bootcoding.basic.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStudent {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("avahul",23,2672778));
        list.add(new Student("navin",18,73873832));
        list.add(new Student("vinit",21,82383682));
        list.add(new Student("sohil",28,76478322));
        list.add(new Student("ajay",34,78327832));
        list.add(new Student("maruti",38,5643273));
        list.add(new Student("pranay",17,73787347));


        Collections.sort(list, Student.StuNameComparator);

          for(Student s1 :list){
              System.out.println(s1);
          }

    }
}
