package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightsSetRetrievier {
    public Set<Flight> retrieve() {
        Set<Flight> flightsSet = new HashSet<Flight>();
        flightsSet.add(new Flight("Warszawa", "Gdansk", "2891"));
        flightsSet.add(new Flight("Gdansk", "Wroclaw", "3087"));
        flightsSet.add(new Flight("Goleniow", "Wroclaw", "4592"));
        flightsSet.add(new Flight("Krakow", "Goleniow", "1223"));
        flightsSet.add(new Flight("Warszawa", "Krakow", "5321"));
        flightsSet.add(new Flight("Goleniow", "Warszawa", "4241"));
        flightsSet.add(new Flight("Warszawa", "Poznan", "2233"));
        flightsSet.add(new Flight("Wroclaw", "Poznan", "1423"));
        flightsSet.add(new Flight("Poznan", "Wroclaw", "2661"));
        flightsSet.add(new Flight("Krakow", "Wroclaw", "4131"));
        flightsSet.add(new Flight("Warszawa", "Goleniow", "1911"));
        return flightsSet;
    }
}
