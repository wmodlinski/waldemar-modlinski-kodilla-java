package com.kodilla.rps;

import java.util.Random;

public class Computer {

    Player player2;

    public Computer(Player player2) {
        this.player2 = player2;
    }

    public Player player2() {
        return player2;
    }

    public int random() {
        Random generator = new Random();
        int random = generator.nextInt(3);
        return random + 1;
    }
}
