package com.kodilla.rps;

import java.util.Scanner;

public class GameLogic {

    public void menu() {

        //Poprawić na dużą literę kamień

        System.out.println("==========>> GRA W PAPIER, KAMIEń, NOŻYCE <<==========");
        System.out.println();
        System.out.println("Witaj! Zanim zaczniemy rozgrywkę przypomnę zasady! ");

        System.out.println("Gra składa się z kolejnych tur (ich ilość za chwilę wybierzesz!)");
        System.out.println("W każdej turze wybierasz papier, kamień lub nożyce.");
        System.out.println("Nożyce są silniejsze od papieru, ponieważ go tną.");
        System.out.println("Kamień jest silniejszy od nożyc, ponieważ je tępi");
        System.out.println("Papier jest silniejszy od kamienia, ponieważ go owija.");

        System.out.println(">> Zagranie kamień - klawisz '1'");
        System.out.println(">> Zagranie papier - klawisz '2'");
        System.out.println(">> Zagranie nożyce - klawisz '3'");
    }

    public Thing switchGame(char b) {

        while(b!=49 && b!=50 && b!=51) {
            System.out.println("Ta gra nie obsługuje tego klawisza.");
            b = scanerChar();
        }
        switch(b) {
            case 49:
            case 50:
            case 51:{
                return choosen1(b);
            }
            default: {
                return null;
            }
        }
    }

    public boolean overX(char over) {
        boolean m = false;
        if (over == 120) {
            System.out.println("Czy na pewno zakończyć grę? " + " T/N");
            do {
                over = scanerChar();
                if (over != 116 && over != 110) System.out.println("Wciśnij T lub N");
            } while (over != 116 && over != 110);
            if (over == 110) {
                System.out.println(">> Nowa gra? " + " T/N");
                do {
                    over = scanerChar();
                    if (over != 116 && over != 110) System.out.println("Wciśnij T lub N");
                } while (over != 116 && over != 110);
                if (over == 110) m = true;
                else m = false;
            } else m = true;
        }
        if (over == 110) {
            System.out.println("Czy chcesz zacząć nową grę? " + " T/N");
            do {
                over = scanerChar();
                if (over != 116 && over != 110) System.out.println("Wciśnij T lub N");
            } while (over != 116 && over != 110);
            if (over == 110) {
                System.out.println(">> Czy na pewno zakończyć grę? " + " T/N");
                do {
                    over = scanerChar();
                    if (over != 116 && over != 110) System.out.println("Wciśnij T lub N");
                } while (over != 116 && over != 110);
                if (over == 110) m = false;
                else m = true;
            } else m = false;
        }
        return m;
    }

    public int scanerInt() {
        Scanner scaner = new Scanner(System.in);
        int x = scaner.nextInt();
        return x;
    }

    public char scanerChar() {
        Scanner scaner = new Scanner(System.in);
        char a = scaner.next().charAt(0);
        return a;
    }

    public Thing choosen(int liczba) {
        Thing object;
        if(liczba == 1) {
            object = new Rock();
        } else if(liczba == 2) {
            object = new Paper();
        } else {
            object = new Scissors();
        }
        return object;
    }

    public Thing choosen1(char liczba) {
        Thing object;
        if(liczba == 49) {
            object = new Rock();
        } else if(liczba == 50) {
            object = new Paper();
        } else {
            object = new Scissors();
        }
        return object;
    }

    public int resultInt(int resultPlayer1, int resultPlayer2) {

        if (resultPlayer1 == resultPlayer2) {
            System.out.println("Remis");
            return 0;
        } else if ((resultPlayer1 == 3 && resultPlayer2 == 2) || (resultPlayer1 == 2 && resultPlayer2 == 1)
                || resultPlayer1 == 1 && resultPlayer2 == 3) {
            System.out.println("Wygrywasz!");
            return 1;
        } else {
            System.out.println("Przegrywasz!");
            return 2;}
    }

    public void result(int resultPlayer1, int resultPlayer2) {
        if(resultPlayer1 > resultPlayer2) {
            System.out.println("Wygrywasz grę : " + resultPlayer1 + " do " + resultPlayer2);
        } else if (resultPlayer1 < resultPlayer2) {
            System.out.println("Przegrywasz grę : " + resultPlayer1 + " do " + resultPlayer2);
        } else {
            System.out.println("Remis: " + resultPlayer1 + " do " + resultPlayer2);
        }
        System.out.println();
    }
}