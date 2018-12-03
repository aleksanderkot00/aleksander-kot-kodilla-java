package com.kodilla.good.patterns.flights;

public class Main {
    public static void main(String[] args) {

        FlightsFinder flightsFinder = new FlightsFinder();

        System.out.println("Flights to Goleniow:");
        for(Flight flight: flightsFinder.flightsTo("Goleniow")) {
            System.out.println(flight);
        }

        System.out.println("\nFlights from Warszawa:");
        for(Flight flight: flightsFinder.flightsFrom("Warszawa")) {
            System.out.println(flight);
        }

        System.out.println("\n Connecting flights from Warszawa to Krakow:");
        for(ConnectingFlight connectingFlight: flightsFinder.connectingFlights("Warszawa", "Wroclaw")) {
            System.out.println(connectingFlight);
        }
    }
}
