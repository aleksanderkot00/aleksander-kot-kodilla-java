package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    public ArrayList<Shape> shapeList = new ArrayList<Shape>();

    public void addFigure(Shape shape) {

        this.shapeList.add (shape);
    }
    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (this.shapeList.contains(shape)){
            this.shapeList.remove(shape);
            result = true;
        }
        return result;

    }
    public Shape getFigure(int n) {
        return this.shapeList.get(n);
    }
    public ArrayList<String> showFigures() {
        ArrayList<String> result = new ArrayList<String>();
        for (Shape figure: this.shapeList) {
            result.add(("Figure number: " + (shapeList.indexOf(figure) + 1)+ "; figure name: " + figure.getShapeName() + "; field: " + figure.getField()));
            System.out.println("Figure number: " + (shapeList.indexOf(figure) + 1)+ "; figure name: " + figure.getShapeName() + "; field: " + figure.getField());
        }
        return result;
    }
}