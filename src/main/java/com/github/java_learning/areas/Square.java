package com.github.java_learning.areas;

public class Square extends Figure {
    private final double size;

    public Square(double sizeParameter) {
        this.size = sizeParameter;
    }

    @Override

    public double getArea() {
        return size * size;
    }
}
