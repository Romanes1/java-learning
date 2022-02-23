package com.github.java_learning.Transactions;

public class Refill extends Transaction {
    private final int got;

    public Refill(int j) {
        this.got = j;
    }

    @Override
    public int diff() {
        return got;
    }
}