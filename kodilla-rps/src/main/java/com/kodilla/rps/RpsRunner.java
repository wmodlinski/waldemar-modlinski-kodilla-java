package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {

        int round = 0;
        int resultPlayer1 = 0;
        int resultPlayer2 = 0;
        GameLogic game = new GameLogic();
        game.menu();
        System.out.print("Podaj swoje imie: ");
        Scanner name = new Scanner(System.in);
        String nick = name.nextLine();
        Player player1 = new Player(nick);
        Player player2 = new Player("Komputer");

    }
}
