package com.kodilla.rps;

import com.kodilla.rps.exceptions.EndGameException;
import com.kodilla.rps.exceptions.NewGameException;
import com.kodilla.rps.exceptions.WrongNumberException;

public interface Player {

    int ROCK = 1;
    int PAPER = 2;
    int SCISSORS = 3;

    Figure playerMove() throws WrongNumberException, NewGameException, EndGameException;
    String getPlayerName();
}
