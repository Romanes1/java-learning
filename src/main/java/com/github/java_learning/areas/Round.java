package com.github.java_learning.areas;

public class Round extends Figure {
    private final double r;

    public Round(double radius) {
        this.r = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }


}
