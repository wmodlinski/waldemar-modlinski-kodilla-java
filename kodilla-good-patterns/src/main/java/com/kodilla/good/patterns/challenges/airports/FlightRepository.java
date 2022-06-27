package com.kodilla.good.patterns.challenges.airports;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsList() {

        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("SZC", "WAW"));
        flights.add(new Flight("WAW", "KAT"));
        flights.add(new Flight("WRC", "KRK"));
        flights.add(new Flight("DUB", "WAW"));
        flights.add(new Flight("SZC", "DUB"));
        flights.add(new Flight("WAW", "KRK"));
        flights.add(new Flight("WRC", "DUB"));
        flights.add(new Flight("KAT", "WAW"));
        return flights;
    }
}