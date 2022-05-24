package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(2.5, 1.5);
        } catch (Exception e) {
            System.out.println("Tu mamy jakiś błąd ---> " + e);
        } finally {
            System.out.println("Obliczenia zakończone!");
        }
    }
}
