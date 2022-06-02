package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FlightChecker {

    public Set<Map.Entry<String, Boolean>> findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> flightMap = new HashMap<>();

        flightMap.put("Warsaw", true);
        flightMap.put("Paris", true);
        flightMap.put("Barcelona", false);

        for (Map.Entry<String, Boolean> entry : flightMap.entrySet()) {

            if (flight.getDepartureAirport().equals(entry.getKey())){
                System.out.println("This flight is avaible");

            }else{
                throw new RouteNotFoundException("This airport is not support. Please try different one");
            }
        }
        return flightMap.entrySet();
    }
}
