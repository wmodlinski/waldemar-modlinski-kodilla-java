package com.kodilla.rps;

import java.util.Scanner;
import java.util.Random;

public class RpsRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int computerResult = 0;
        int playerResult = 0;
        int rounds = 0;

        boolean isRunning = false;
        boolean newGame = false;

        System.out.println("==========>> Gra w papier, kamień, nożyczki <<==========");

        System.out.println("Witaj, podaj swoje imie: ");
        String name = scanner.nextLine();

        System.out.println(name + " kojarzysz zasady? No to tak w skrócie: ");
        System.out.println("Gra składa się z kolejnych tur (ich ilość za chwilę wybierzesz!)");
        System.out.println("W każdej turze wybierasz papier, kamień lub nożyczki.");
        System.out.println("Nożyczki są silniejsze od papieru, ponieważ go tną.");
        System.out.println("Kamień jest silniejszy od nożyczek, ponieważ je tępi.");
        System.out.println("Papier jest silniejszy od kamienia, ponieważ go owija.");
        System.out.println("To co " + name + " zaczynamy grę? (T/N)");

        String play = scanner.nextLine();
        isRunning = play.equalsIgnoreCase("T");

        if (isRunning == true) {

            System.out.println(">> Zagranie kamień - klawisz '1'");
            System.out.println(">> Zagranie papier - klawisz '2'");
            System.out.println(">> Zagranie nożyce - klawisz '3'");
            System.out.println(">> Nowa gra - klawisz 'N'");
            System.out.println(">> Koniec gry - klawisz 'X' ");
            System.out.println("Ile rund zagramy? ");

            rounds = Integer.parseInt(scanner.nextLine());
            isRunning = rounds > 0;
        }

        while (isRunning) {

            System.out.println("Wybierz swój kształt!");

            String user = scanner.nextLine();
            if (user.equalsIgnoreCase("X")) {
                System.out.println("Naprawdę chcesz zakończyć rozgrywkę? (T/N)");
                String close = scanner.nextLine();
                if (close.equalsIgnoreCase("T")) {
                    System.out.println("Do zobaczenia!");
                    System.exit(0);
                } else {
                    continue;
                }
            } else if (user.equalsIgnoreCase("N")) {
                System.out.println("Chcesz zakończyć rozgrywkę? (T/N)");
                String reloadGame = scanner.nextLine();
                if (reloadGame.equalsIgnoreCase("T")) {
                    playerResult = 0;
                    computerResult = 0;
                    continue;
                } else {
                    continue;
                }
            } else if (isEquals(user)) {
                int comp = random.nextInt(3) + 1;
                System.out.println("Mój wybór to " + comp);
                if (userWin(user, comp)) {
                    System.out.println("Brawo " + name + " punkt dla Ciebie!");
                    playerResult++;
                } else if (compWin(user, comp)) {
                    System.out.println("Tym razem punkt dla mnie!");
                    computerResult++;
                } else if (draw(user, comp)) {
                    System.out.println("Ten sam kształt!");
                }

                System.out.println("Wynik " + name + ": " + playerResult + " == Komputer: " + computerResult);
            }

            if (isGameFinised(computerResult, playerResult, rounds)) {

                if (computerResult > playerResult) {
                    System.out.println("Wygrałem, nie poddawaj się!");
                } else {
                    System.out.println("Tym razem Ci się udało!");
                }

                System.out.println("Zagramy jeszcze raz? (T/N)");
                String next = scanner.nextLine();
                if (next.equalsIgnoreCase("T")) {
                    playerResult = 0;
                    computerResult = 0;

                } else {
                    System.out.println("Do zobaczenia!");
                    isRunning = false;
                }
            }
        }
    }

    private static boolean compWin(String user, int comp) {
        return (user.equals("1") && comp == 2) || (user.equals("2") && comp == 3) || (user.equals("3") && comp == 1);
    }

    private static boolean userWin(String user, int comp) {
        return (user.equals("1") && comp == 3) || (user.equals("2") && comp == 1) || (user.equals("3") && comp == 2);
    }

    private static boolean draw(String user, int comp) {
        return (user.equals("1") && comp == 1) || (user.equals("2") && comp == 2) || (user.equals("3") && comp == 3);
    }

    private static boolean isEquals(String user) {
        return user.equals("1") || user.equals("2") || user.equals("3");
    }

    //private static boolean isGameFinised(int comScore, int userScore, int rounds) {
        //return comScore >= rounds || userScore >= rounds;
    //}

    private static boolean isGameFinised(int comScore, int userScore, int rounds) {
        return rounds <= comScore + userScore;
    }
}
