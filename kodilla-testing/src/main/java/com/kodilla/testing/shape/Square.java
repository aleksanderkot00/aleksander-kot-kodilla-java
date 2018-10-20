package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {

    private final double side;

    public Square(double side) {
        this.side = side;
    }

    public String getShapeName() {
        return "square";
    }

    public double getField() {
        return side * side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.side, side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }

    @Override
    public String toString() {
        return "Square(" + side + "), field - " + getField() + "; ";
    }
}
