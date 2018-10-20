package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(new Triangle(2,6));
        //When
        Shape shape = new Triangle(2,6);
        boolean result = collector.shapeList.contains(shape);
        //Then
        Assert.assertTrue(result);
    }
    @Test
    public void testRemoveFigureNotExisting() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        //When
        boolean result = collector.removeFigure(new Circle(2.5));
        //Then
        Assert.assertFalse(result);
    }
    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape shape = new Square(5);
        collector.addFigure(shape);
        //When
        Shape retrievedShape = collector. getFigure(0);
        //Then
        Assert.assertEquals(shape, retrievedShape);
    }
    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(new Triangle(5,4));
        collector.addFigure(new Square(3));
        collector.addFigure(new Circle(1));
        //When
        ArrayList<String> showFigures = collector.showFigures();
        ArrayList<String> expectedShowFigures= new ArrayList<String>();
        expectedShowFigures.add(("Figure number: " + 1 + "; figure name: " + "triangle" + "; field: " + 10.0));
        expectedShowFigures.add(("Figure number: " + 2 + "; figure name: " + "square" + "; field: " + 9.0));
        expectedShowFigures.add(("Figure number: " + 3 + "; figure name: " + "circle" + "; field: " + (Math.PI/2)));
        //Then
        Assert.assertEquals(expectedShowFigures, showFigures);
    }
}
