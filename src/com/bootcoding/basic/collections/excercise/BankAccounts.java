package com.bootcoding.basic.collections.excercise;

public class BankAccounts {
    private int accountIds;
    private String bankNames;
    private String branchs;

    public int getAccountIds() {
        return accountIds;
    }

    public void setAccountIds(int accountIds) {
        this.accountIds = accountIds;
    }

    public String getBankNames() {
        return bankNames;
    }

    public void setBankNames(String bankNames) {
        this.bankNames = bankNames;
    }

    public String getBranchs() {
        return branchs;
    }

    public void setBranchs(String branchs) {
        this.branchs = branchs;
    }

    public double getCurrentBalances() {
        return currentBalances;
    }

    public void setCurrentBalances(double currentBalances) {
        this.currentBalances = currentBalances;
    }

    private double currentBalances;
}
