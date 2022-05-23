package com.kodilla.exception.test;

public class FirstChallenge {

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {

            firstChallenge.divide(3, 0);

        } catch (ArithmeticException e) {

            System.out.println("Coś poszło nie tak! Zerknij co poszło nie tak ---> " + e);

        } finally {
            System.out.println("Dobrnęliśmy do końca! :)");
        }

    }

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}