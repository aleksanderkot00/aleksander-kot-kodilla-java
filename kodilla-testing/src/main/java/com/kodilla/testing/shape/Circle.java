package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {
    private double radious;

    public Circle(double radious) {
        this.radious = radious;
    }

    public String getShapeName() {
        return "circle";
    }

    public double getField() {
        return 0.5*Math.PI*this.radious*this.radious;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radious, radious) == 0;
    }
}
