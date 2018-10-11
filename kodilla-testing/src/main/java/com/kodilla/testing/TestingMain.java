package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("first test OK");
        } else {
            System.out.println("Error! - first test");
        }

        Calculator calculator = new Calculator();
        int a = 37;
        int b = 15;


        if (calculator.add(a, b) == (a  + b) && calculator.substract(a, b) == (a - b)) {
            System.out.println("second test OK");
        } else {
            System.out.println("Error! - second test");
        }
    }
}