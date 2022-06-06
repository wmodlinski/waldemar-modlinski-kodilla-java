package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightChecker {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Warsaw", true);
        flightMap.put("Paris", true);
        flightMap.put("Barcelona", false);

        Boolean isAvailable = flightMap.get(flight.getArrivalAirport());

        if (isAvailable == null) {
            throw new RouteNotFoundException("This airport is not support. Please try different one");
        }

        return isAvailable;
    }

            //if (flight.getDepartureAirport().equals(entry.getKey())){
                //System.out.println("This flight is avaible");

            //}else{
                //throw new RouteNotFoundException("This airport is not support. Please try different one");
            //}
        //}
}

