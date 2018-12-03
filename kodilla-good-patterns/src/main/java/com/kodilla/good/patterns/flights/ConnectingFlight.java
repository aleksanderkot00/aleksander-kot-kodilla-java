package com.kodilla.good.patterns.flights;

public class ConnectingFlight {

    private Flight firstFlight;
    private Flight secondFlight;

    public ConnectingFlight(Flight firstFlight, Flight secondFlight) {
        this.firstFlight = firstFlight;
        this.secondFlight = secondFlight;
    }

    @Override
    public String toString() {
        return "ConnectingFlight{" +
                "first flight - {" + firstFlight.toString() +
                "}, secondFlight - {" + secondFlight.toString() +
                "}}";
    }
}
