package com.bootcoding.basic.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListBasic {
    public static void main(String[] args) {
        List<Employee> emp=new ArrayList<>();
        emp.add(new Employee("ashwin",31,"aasd@gmail.com"));
        emp.add(new Employee("rahul",37,"d@gmail.com"));
        emp.add(new Employee("baba",20,"sd@gmail.com"));

        Comparator<Employee> usr=new Comparator<Employee>() {
            @Override
            public int compare(Employee first, Employee second) {
//                if(first instanceof Employee){
//                    return (first.getName().compareTo(second.getName()));
//                }
                if(first.getAge()>second.getAge()){
                    return 1;
                }
                else
                    return -1;
            }
        };
        Collections.sort(emp,usr);
       emp.forEach(s-> System.out.println(s));
    }
}
