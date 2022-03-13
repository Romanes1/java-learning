package com.github.java_learning.importPayment;

public class Materials extends ImportedProduct {
    private final double cost;

    public Materials(double cost) {
        this.cost = cost;
    }

    @Override
    public double vatTax() {
        return cost / 5;
    }

    @Override
    public double customsDuty() {
        return cost / 20;
    }

    @Override
    public double costOfFreight() {
        return cost / 15;
    }
}
