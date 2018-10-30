package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            System.out.println(secondChallenge.probablyIWillThrowException(0.9, 1.6));
        } catch (Exception e) {
            System.out.println("Exeption has foud! " + e);
        } finally {
            System.out.println("End of program.");
        }
    }
}
