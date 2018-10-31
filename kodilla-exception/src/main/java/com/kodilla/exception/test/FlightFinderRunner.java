package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args) {

        Flight flight1 = new Flight("London", "Berlin");
        Flight flight2 = new Flight("Warsaw", "Madrid");

        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFilght(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("We don't have information about this arrival airport!");
        }

        try {
            flightFinder.findFilght(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println(e + " We don't have information about this arrival airport!");
        }
    }
}
