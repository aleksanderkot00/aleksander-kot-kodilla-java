package com.kodilla.rps;

import java.util.Scanner;

public class userPlayer implements Player {

    private String playerName;
    private Scanner scanner = new Scanner(System.in);

    public userPlayer(String playerName) {
        this.playerName = playerName;
    }

    public Figure playerMove() {
        String move = scanner.nextLine();
        if (move == "1") {
            return new Rock();
        } else if (move == "2") {
            return new Paper();
        } else {
            return new Scissors();
        }
    }

    public String getPlayerName() {
        return playerName;
    }
}
