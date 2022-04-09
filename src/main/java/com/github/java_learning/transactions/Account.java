package com.github.java_learning.transactions;

import java.util.List;

public class Account {

    private double balance;

    public Account(double balance, String ownerName){
        this.balance = balance;
    }

    public void apply(Transaction transaction) {
        balance += transaction.diff();
    }

    public double balance() {
        return this.balance;
    }

    public List<Transaction> history(){
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        return Double.compare(account.balance, balance) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(balance);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}

