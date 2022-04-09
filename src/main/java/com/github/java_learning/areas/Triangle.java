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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.leg1, leg1) != 0) return false;
        return Double.compare(triangle.leg2, leg2) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(leg1);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(leg2);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "leg1=" + leg1 +
                ", leg2=" + leg2 +
                '}';
    }
}
