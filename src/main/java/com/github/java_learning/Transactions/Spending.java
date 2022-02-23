package com.github.java_learning.Transactions;

public class Spending extends Transaction {
    private final int spent;

    public Spending(int i) {
        this.spent = -i;
    }

        @Override
        public int diff () {
            return spent;
        }
    }




