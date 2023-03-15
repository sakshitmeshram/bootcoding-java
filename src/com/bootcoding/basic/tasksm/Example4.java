package com.bootcoding.basic.tasksm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String args[]) { List<String> withDupes = Arrays.asList("ravi","komal","ravi","suresh","anuj","ravi","suresh");
        System.out.println("List with duplicates: " + withDupes);
        List<String> withoutDupes = withDupes.stream() .distinct() .collect(Collectors.toList());

        System.out.println("List without duplicates: " + withoutDupes); }

}
