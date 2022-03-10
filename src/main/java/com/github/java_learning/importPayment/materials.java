package com.github.java_learning.importPayment;

public class materials extends importedProduct {
    private final double cost;

    public materials(double cost) {
        this.cost = cost;
    }

    @Override
    public double VATTax() {
        return cost / 5;
    }

    @Override
    public double CustomsDuty() {
        return cost / 20;
    }

    @Override
    public double CostOfFreight() {
        return cost / 15;
    }
}
