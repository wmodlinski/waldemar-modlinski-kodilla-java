package com.kodilla.good.patterns.challenges.airports;

public class FlightApp {

    public static void main(String[] args) {

        FlightController flightController = new FlightController();
        System.out.println(flightController.findFlightsFrom("SZC"));

        FlightController flightControllerArrival = new FlightController();
        System.out.println(flightControllerArrival.findFlightsTo("KRK"));

        FlightController flightController1 = new FlightController();
        System.out.println(flightController1.findFlightsVia("SZC", "WAW", "KAT"));

    }
}