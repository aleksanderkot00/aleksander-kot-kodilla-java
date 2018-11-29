package com.kodilla.rps.players;

import com.kodilla.rps.exceptions.EndGameException;
import com.kodilla.rps.exceptions.NewGameException;
import com.kodilla.rps.exceptions.WrongSignException;
import com.kodilla.rps.figures.Figure;

public interface Player {

    int ROCK = 1;
    int PAPER = 2;
    int SCISSORS = 3;

    Figure playerMove() throws WrongSignException, NewGameException, EndGameException;
    String getPlayerName();
}
