package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private double baseLength;
    private double height;

    public Triangle(double baseLength, double height) {
        this.baseLength = baseLength;
        this.height = height;
    }

    public String getShapeName() {
        return "triangle";
    }

    public double getField() {
        return 0.5*this.baseLength*this.height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.baseLength, baseLength) == 0 &&
                Double.compare(triangle.height, height) == 0;
    }
}
