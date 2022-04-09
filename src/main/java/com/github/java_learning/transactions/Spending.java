package com.github.java_learning.transactions;

public class Spending extends Transaction {

    private double amount;

    public Spending(double amount, String comment) {
        this.amount = amount;
    }

    @Override
    public double diff() {
        return -amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Spending spending = (Spending) o;

        return Double.compare(spending.amount, amount) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(amount);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Spending{" +
                "amount=" + amount +
                '}';
    }
}


