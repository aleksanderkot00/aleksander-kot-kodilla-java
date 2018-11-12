package com.kodilla.rps;

import com.kodilla.rps.exceptions.EndGameException;
import com.kodilla.rps.exceptions.NewGameException;
import com.kodilla.rps.exceptions.WrongNumberException;

import java.util.Scanner;

public class UserPlayer implements Player {

    private String playerName;
    private Scanner scanner = new Scanner(System.in);

    public UserPlayer(String playerName) {
        this.playerName = playerName;
    }

    public Figure playerMove() throws WrongNumberException, NewGameException, EndGameException {

        String move = scanner.nextLine();
        try {
            int intMove = Integer.parseInt(move);
            if (intMove == ROCK) {
                return new Rock();
            } else if (intMove == PAPER) {
                return new Paper();
            } else if (intMove == SCISSORS) {
                return new Scissors();
            } else {
                throw new WrongNumberException();
            }
        } catch (NumberFormatException e) {
            if (move.equals("x")){
                throw new EndGameException();
            } else if (move.equals("n")) {
                throw new NewGameException();
            } else {
                throw new WrongNumberException();
            }
        }
    }

    public String getPlayerName() {
        return playerName;
    }
}