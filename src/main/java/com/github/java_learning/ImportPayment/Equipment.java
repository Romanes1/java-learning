package com.github.java_learning.ImportPayment;

public class Equipment extends Imported_product {

    private double cost;
    public Equipment(double cost)
    {
        this.cost = cost;
    }


    @Override
    public double VAT_Tax() {
        return cost/5;
    }

    @Override
    public double CustomsDuty() {
        return cost/10;
    }

    @Override
    public double CostOfFreight() {
        return cost/10;

    }
}
