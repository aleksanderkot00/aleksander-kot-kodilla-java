package com.kodilla.good.patterns.flights;

import java.util.Objects;

public class Flight {

    private String departureCity;
    private String arrivalCity;
    private String flightNumber;

    public Flight(String departureCity, String arrivalCity, String flightNumber) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.flightNumber = flightNumber;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departureCity, flight.departureCity) &&
                Objects.equals(arrivalCity, flight.arrivalCity) &&
                Objects.equals(flightNumber, flight.flightNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureCity, arrivalCity, flightNumber);
    }

    @Override
    public String toString() {
        return "Departure City - '" + departureCity + '\'' +
                ", arrival city - '" + arrivalCity + '\'' +
                ", flight number -'" + flightNumber + '\'';
    }
}
