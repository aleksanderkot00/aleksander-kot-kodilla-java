package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Monday shopping", "bread", 1.5);
            case PAINTING:
                return new PaintingTask("drawing 24", "green", "tree");
            case DRIVING:
                return new DrivingTask("passage 12", "Warsaw", "car");
            default:
                return null;
        }

    }
}
