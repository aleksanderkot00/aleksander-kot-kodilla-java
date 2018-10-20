package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private double sideLenght;

    public Square(double sideLenght) {
        this.sideLenght = sideLenght;
    }

    public String getShapeName() {
        return "square";
    }

    public double getField() {
        return this.sideLenght*this.sideLenght;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.sideLenght, sideLenght) == 0;
    }
}
