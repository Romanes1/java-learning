package com.github.java_learning.importPayment;

public class Equipment extends com.github.java_learning.importPayment.ImportedProduct {

    private double cost;

    public Equipment(double cost) {
        this.cost = cost;
    }


    @Override
    public double vatTax() {
        return cost / 5;
    }

    @Override
    public double customsDuty() {
        return cost / 10;
    }

    @Override
    public double costOfFreight() {
        return cost / 10;

    }
}
