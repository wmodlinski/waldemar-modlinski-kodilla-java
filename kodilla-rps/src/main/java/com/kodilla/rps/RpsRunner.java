package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {

        boolean end = true;
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


        //Musi być jakaś pętla aby grać ponownie

        //while(end!) {
            System.out.print("Podaj ile rund chcesz rozegrać: ");
            int roundsNumber = game.scanerInt();
            System.out.println();

            for(int i=0; i<roundsNumber;) {
                round++; i++;
                System.out.println("Runda " + round);
                System.out.println("Zagrywa: " + player1.getPlayer());
                char number = game.scanerChar();
                Thing result = game.switchGame(number);
                System.out.println(result);

                Computer computer = new Computer(player2);
                System.out.println("Kolej na " + player2.getPlayer());

                int number2 = computer.random();
                System.out.println(game.choosen(number2).getThingName());

                int z = game.resultInt(number, number2);
                if(z>0) {
                    if(z==1) {
                        resultPlayer1++;
                    } else resultPlayer2++;
                }

                if (round<roundsNumber) {System.out.println("Aktualny wynik gry: " + resultPlayer1 + " do " + resultPlayer2);}
                System.out.println();

            }
            game.result(resultPlayer1, resultPlayer2);
            round = 0;
            resultPlayer1 = 0;
            resultPlayer2 = 0;
            System.out.println();
            System.out.println(">> Nowa gra - klawisz 'n'");
            System.out.println(">> Koniec gry - klawisz 'x' ");
            System.out.println();
            char over;

            do {
                over = game.scanerChar();
            } while(over!=120 && over!=110);
            end = game.overX(over);
        }
    }
//}
