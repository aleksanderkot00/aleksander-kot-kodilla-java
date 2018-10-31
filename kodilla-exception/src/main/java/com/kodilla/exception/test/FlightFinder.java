package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFilght(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> arrivalAirports = new HashMap<>();
        arrivalAirports.put("London", true);
        arrivalAirports.put("Berlin", true);
        arrivalAirports.put("Warsaw", false);
        arrivalAirports.put("Vienna", true);
        arrivalAirports.put("New York", false);
        arrivalAirports.put("Prague", false);
        arrivalAirports.put("Munich", true);
        arrivalAirports.put("Poznan", false);

        if (arrivalAirports.containsKey(flight.getArrivalAirport())) {
            System.out.println("Flight to " + flight.getArrivalAirport() + ": " + arrivalAirports.get(flight.getArrivalAirport()));
        } else {
            throw new RouteNotFoundException("Introduced key isn't on the map!");
        }
    }
}
