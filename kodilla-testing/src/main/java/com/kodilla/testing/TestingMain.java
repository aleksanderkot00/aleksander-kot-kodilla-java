package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void testingSimpleUser(){
        System.out.println("SimpleUser testing:");
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("SimpleUser test OK");
        } else {
            System.out.println("Error! - SimpleUser");
        }
    }
    public static void testingCalculator(){
        System.out.println("Calculator testing:");
        Calculator calculator = new Calculator();
        int a = 37;
        int b = 15;

        if (calculator.add(a, b) == 52) {
            System.out.println("Adding test OK");
        } else {
            System.out.println("Error! - adding test");
        }
        if (calculator.substract(a, b) == 22) {
            System.out.println("Substracting test OK");
        } else {
            System.out.println("Error! - substracting test");
        }
    }
    public static void main(String[] args) {
        testingSimpleUser();
        testingCalculator();
    }
}