package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {

        System.out.print("Podaj swoje imie: ");
        Scanner name = new Scanner(System.in);
        String nick = name.nextLine();
        Player player = new Player(nick);
        Player player2 = new Player("Computer");
        System.out.println("Witaj " + nick + "! Zaczynamy rozgrywkę! ");
        System.out.println("Wybierz ilość rund: ");

    }
}
