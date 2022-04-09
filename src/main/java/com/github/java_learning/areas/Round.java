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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Round round = (Round) o;

        return Double.compare(round.r, r) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(r);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Round{" +
                "radius of the round=" + r +
                '}';
    }
}
