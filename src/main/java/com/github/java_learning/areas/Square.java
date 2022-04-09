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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return Double.compare(square.size, size) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(size);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Square{" +
                "size of one side=" + size +
                '}';
    }
}
