package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        System.out.println("Start testu nr. 1:");

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Start testu nr. 2:");

        Calculator calculator = new Calculator();
        int addAtoB = calculator.add(9, 7);
        if (addAtoB == 16) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Start testu nr. 3:");

        int substractAtoB = calculator.substract(10, 8);
        if (substractAtoB == 2) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
