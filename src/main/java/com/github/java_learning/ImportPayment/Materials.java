package com.github.java_learning.ImportPayment;

public class Materials extends Imported_product {
    private final double cost;

    public Materials(double cost)
    {
        this.cost = cost;
    }

    @Override
    public double VAT_Tax() {
        return cost/5;
    }

    @Override
    public double CustomsDuty() {
        return cost/20;
    }

    @Override
    public double CostOfFreight() {
        return cost/15;
    }
}
