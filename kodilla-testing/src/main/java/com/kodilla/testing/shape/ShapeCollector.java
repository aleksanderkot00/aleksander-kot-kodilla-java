package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();

    public List<Shape> getShapes() {
        return shapes;
    }

    public void addFigure(Shape shape) {
        shapes.add (shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            return true;
        } else return false;
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public String showFigures() {
        String string = "";
        StringBuilder sB = new StringBuilder(string);
        for (Shape figure: shapes) {
            sB.append(figure.toString() + ", field - " + figure.getField() + "; ");
        }
        return sB.toString();
    }
}
