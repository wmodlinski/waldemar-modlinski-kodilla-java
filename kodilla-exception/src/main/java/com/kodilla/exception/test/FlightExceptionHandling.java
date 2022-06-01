package com.kodilla.exception.test;

public class FlightExceptionHandling {

    public static void main(String[] args) {

        Flight flight = new Flight("London", "New York");
        FlightChecker flightChecker = new FlightChecker();

        try {
            flightChecker.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("The flight has not been found. Programme is still working");
        } finally {
            System.out.println("Choose another destination");
        }
    }
}
