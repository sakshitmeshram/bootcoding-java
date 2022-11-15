package com.bootcoding.basic.collections.excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeesDataGenerator {

    BankAccounts bankAccounts = new BankAccounts();

    String[] employeeName = {"Ram","Laxman","Ajay","suyesh","vedant","arun","priya"};

    String[] banksNames = {"HDFC","Axis","SBI","BOI","Baroda",};

    int getLength=banksNames.length;
    int length = employeeName.length;

    public List<Employees> createRandomEmployee(int numberOfEmployee){

        List<Employees>employeesList = new ArrayList<>();

        for(int i=0;i<numberOfEmployee;i++){

            Employees employees = new Employees();

           employees.setId(i);
           employees.setName(generateRandomEmployeeName());
           employees.setExperience(genrateRandomEmployeeExperience());
           employees.setSalary(generateRandomSalary());
           employees.setBankAccounts(generateRandombankAccount());


           employeesList.add(employees);

        }


        return employeesList;

    }

    private BankAccounts generateRandombankAccount() {

        bankAccounts.setAccountIds(generateRandomAccountId());
        bankAccounts.setBankNames(generateRandomBankAccountName());
        bankAccounts.setBranchs("Nagpur");
        bankAccounts.setCurrentBalances(generateRandomCurrentBlance(1000, 1000000));

        return bankAccounts;
    }

    private double generateRandomCurrentBlance(int i, int i1) {
        Random random = new Random();
        return i+random.nextInt(i1-i);

    }

    private String generateRandomBankAccountName() {

        Random random = new Random();
        int index =random.nextInt(getLength);
        return banksNames[index];
    }

    private int generateRandomAccountId() {

        Random random = new Random();
        return 1+random.nextInt(10000);
    }

    private double generateRandomSalary() {
        Random random = new Random();
        return random.nextInt(100000);
    }

    private int genrateRandomEmployeeExperience() {
        Random random = new Random();
       return random.nextInt(10);
    }

    private String generateRandomEmployeeName() {

        Random random = new Random();
        int position =random.nextInt(length);
        return employeeName[position];
    }


}
