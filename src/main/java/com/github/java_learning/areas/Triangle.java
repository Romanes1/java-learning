package com.github.java_learning.areas;

public class Triangle extends Figure {
    private final double leg1;
    private final double leg2;

    public Triangle(double leg1, double leg2) {
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    @Override
    public double getArea() {
        return leg1 * leg2 / 2;
    }
}
