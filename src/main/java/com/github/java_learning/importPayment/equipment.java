package com.github.java_learning.importPayment;

public class equipment extends importedProduct {

    private double cost;

    public equipment(double cost) {
        this.cost = cost;
    }


    @Override
    public double VATTax() {
        return cost / 5;
    }

    @Override
    public double CustomsDuty() {
        return cost / 10;
    }

    @Override
    public double CostOfFreight() {
        return cost / 10;

    }
}
