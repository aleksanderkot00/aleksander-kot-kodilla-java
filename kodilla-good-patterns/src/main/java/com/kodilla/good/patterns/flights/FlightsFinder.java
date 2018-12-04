package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightsFinder {

    private Set<Flight> flightsSet;

    public FlightsFinder() {
        FlightsSetRetrievier flightsSetRetrievier = new FlightsSetRetrievier();
        this.flightsSet = flightsSetRetrievier.retrieve();
    }

    public Set<Flight> flightsTo(String arrivalCity) {
        Set<Flight> result  = flightsSet.stream()
                .filter(flight -> flight.getArrivalCity().equals(arrivalCity))
                .collect(Collectors.toSet());
        return result;
    }

    public Set<Flight> flightsFrom(String departureCity) {
        Set<Flight> result = flightsSet.stream()
                .filter(flight -> flight.getDepartureCity().equals(departureCity))
                .collect(Collectors.toSet());
        return result;
    }

    public Set<ConnectingFlight> connectingFlights(String departureCity, String arrivalCity) {
        Set<ConnectingFlight> result = new HashSet<>();
        for (Flight firstFlight: flightsFrom(departureCity)) {
            for (Flight secondFlight: flightsTo(arrivalCity)) {
                if (firstFlight.getArrivalCity().equals(secondFlight.getDepartureCity())) {
                    result.add(new ConnectingFlight(firstFlight, secondFlight));
                }
            }
        }
        return result;
    }
}
