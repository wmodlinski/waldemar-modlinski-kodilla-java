package com.kodilla.good.patterns.challenges.airports;

import java.util.List;
import java.util.ArrayList;

import static java.util.stream.Collectors.toList;

public class FlightController {

    public List<Flight> findFlightsFrom(String departureFrom) {
        return FlightRepository.getFlightsList().stream()
                .filter(flight -> flight.getDeparture().equalsIgnoreCase(departureFrom))
                .collect(toList());
    }

    public List<Flight> findFlightsTo(String arrivalTo) {
        return FlightRepository.getFlightsList().stream()
                .filter(flight -> flight.getArrival().equalsIgnoreCase(arrivalTo))
                .collect(toList());
    }

    public List<Flight> findFlightsVia(String departureFrom, String via, String arrivalTo) {
        List<Flight> firstStep = FlightRepository.getFlightsList().stream()
                .filter(flight -> flight.getDeparture().equalsIgnoreCase(departureFrom))
                .filter(flight -> flight.getArrival().equalsIgnoreCase(via))
                .collect(toList());

        List<Flight> secondStep = FlightRepository.getFlightsList().stream()
                .filter(flight -> flight.getDeparture().equalsIgnoreCase(via))
                .filter(flight -> flight.getArrival().equalsIgnoreCase(arrivalTo))
                .collect(toList());

        List combinedLists = new ArrayList(firstStep);
        combinedLists.addAll(secondStep);

        return combinedLists;
    }
}