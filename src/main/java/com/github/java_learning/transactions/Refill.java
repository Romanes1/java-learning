package com.github.java_learning.transactions;

public class Refill extends Transaction {

    private double amount;

    public Refill(double amount, String comment) {
        this.amount = amount;
    }

    @Override
    public double diff() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Refill refill = (Refill) o;

        return Double.compare(refill.amount, amount) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(amount);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Refill{" +
                "amount=" + amount +
                '}';
    }
}
