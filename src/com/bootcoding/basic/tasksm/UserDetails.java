package com.bootcoding.basic.tasksm;

import java.util.ArrayList;
import java.util.List;

public class UserDetails {


    public static void main(String[] args) {

        List<Student>list = new ArrayList<>();


        list.add(new Student("ravi ", "kle", "ahsuyudu", "abhsj", "vayuds", "stahjw", 1234, "ind"));
        list.add(new Student("raju ", "tiek", "agduysddu", "jhegfuy", "visucdckbn", "mh", 73862, "ind"));


        for(Student s1 : list){
           System.out.println(s1);

       }

    }
}
