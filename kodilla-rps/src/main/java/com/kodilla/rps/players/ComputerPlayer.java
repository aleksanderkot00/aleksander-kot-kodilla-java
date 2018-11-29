package com.kodilla.rps.players;

import com.kodilla.rps.figures.Figure;
import com.kodilla.rps.figures.Paper;
import com.kodilla.rps.figures.Rock;
import com.kodilla.rps.figures.Scissors;

import java.util.Random;

public class ComputerPlayer implements Player {

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
