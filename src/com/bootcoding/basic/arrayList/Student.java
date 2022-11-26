package com.bootcoding.basic.arrayList;

import java.util.Comparator;

public class Student {

    private String name;
    private int roll;
    private long phNo;


    public Student(String name, int roll, long phNo) {
        this.name = name;
        this.roll = roll;
        this.phNo = phNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", phNo=" + phNo +
                '}';
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public long getPhNo() {
        return phNo;
    }

    public void setPhNo(long phNo) {
        this.phNo = phNo;
    }

    public static Comparator<Student> StuNameComparator = new Comparator<Student>() {


        @Override
        public int compare(Student s1, Student s2) {

            String StudentName1
                    = s1.getName().toUpperCase();
            String StudentName2
                    = s2.getName().toUpperCase();

            return StudentName1.compareTo(
                    StudentName2);

        }
    };

}
