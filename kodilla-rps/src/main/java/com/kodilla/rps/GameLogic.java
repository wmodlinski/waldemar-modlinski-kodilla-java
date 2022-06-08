package com.kodilla.rps;

import java.util.Scanner;

public class GameLogic {

    public void menu() {

        //Poprawić na dużą literę kamień

        System.out.println("==========>> GRA W PAPIER, KAMIEń, NOŻYCE <<==========");
        System.out.println();
        System.out.print("Podaj swoje imie: ");
        Scanner name = new Scanner(System.in);
        String nick = name.nextLine();
        Player player1 = new Player(nick);
        Player player2 = new Player("Komputer");
        System.out.println("Witaj " + nick + "! Zanim zaczniemy rozgrywkę przypomnę zasady! ");

        System.out.println("Gra składa się z kolejnych tur (ich ilość za chwilę wybierzesz!");
        System.out.println("W każdej turze wybierasz papier, kamień lub nożyce.");
        System.out.println("Nożyce są silniejsze od papieru, ponieważ go tną.");
        System.out.println("Kamień jest silniejszy od nożyc, ponieważ je tępi");
        System.out.println("Papier jest silniejszy od kamienia, ponieważ go owija.");

        System.out.println(">> Zagranie kamień - klawisz '1'");
        System.out.println(">> Zagranie papier - klawisz '2'");
        System.out.println(">> Zagranie nożyce - klawisz '3'");

        System.out.println(">> Nowa gra - klawisz 'n'");

        System.out.println(">> Koniec gry - klawisz 'x' ");

        System.out.println("Wybierz ilość rund: ");

        System.out.println();
    }
}
