package com.bootcoding.basic.collections.excercise;

import com.bootcoding.basic.collections.employee.Employee;

import java.util.List;

public class CheckApplication {
    public static void main(String[] args) {

        EmployeesDataGenerator employeesDataGenerator = new EmployeesDataGenerator();

        List<Employees> list =employeesDataGenerator.createRandomEmployee(10);

        for (Employees employee : list){
            System.out.println("ID: " + employee.getId());
            System.out.println("Name : " + employee.getName());
            System.out.println("Experience: " + employee.getExperience());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("Bank Name: " + employee.getBankAccounts().getBankNames());
        }

    }

    private static void printEmployee(Employees employee){
        System.out.println(" ====================  ========================== ======");
        System.out.println("ID: " + employee.getId());
        System.out.println("Name : " + employee.getName());
        System.out.println("Experience: " + employee.getExperience());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Bank Name: " + employee.getBankAccounts().getBankNames());
    }
}


