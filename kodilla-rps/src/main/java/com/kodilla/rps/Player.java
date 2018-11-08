package com.kodilla.rps;

public interface Player {

    int ROCK = 1;
    int PAPER = 2;
    int SCISSORS = 3;

    Figure playerMove();
    String getPlayerName();
}
