package com.github.java_learning.Transactions;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Transaction add = new Refill(300);
        Transaction buyCar = new Spending(100);

        List<Transaction> transactions = Arrays.asList(add, buyCar);
        int diff = 0;
        for (Transaction transaction : transactions) {
            diff += transaction.diff();
        }
        System.out.println(diff);

    }
}