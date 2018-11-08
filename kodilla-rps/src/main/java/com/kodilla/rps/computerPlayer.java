package com.kodilla.rps;

import java.util.Random;

public class computerPlayer implements Player {

    private String playerName = "Computer";

    public Figure playerMove() {
        Random generator = new Random();
        if (generator.nextInt(3) + 1 == ROCK) {
            return new Rock();
        } else if (generator.nextInt(3) + 1 == PAPER) {
            return new Paper();
        } else {
            return new Scissors();
        }
    }

    public String getPlayerName() {
        return playerName;
    }
}
