package com.kodilla.rps;

import com.kodilla.rps.exceptions.EndGameException;
import com.kodilla.rps.exceptions.NewGameException;
import com.kodilla.rps.exceptions.WrongSignException;
import com.kodilla.rps.figures.Figure;
import com.kodilla.rps.players.Player;

import java.util.List;
import java.util.Scanner;


public class RpsGame {

    private static final String YES = "y";
    private static final String NO = "n";
    private static final String EXIT = "x";
    private List<Player> players;
    private int roundsNumber = 0;
    private int playerWinsNumber;
    private int computerWinsNumber;
    private boolean end = false;
    private Scanner scanner = new Scanner(System.in);

    public RpsGame(List<Player> players) {
        this.players = players;
    }

    private void round() throws WrongSignException, NewGameException, EndGameException {
        if (players.size() > 1) {
            Figure move = players.get(0).playerMove();
            if (move.winWith(players.get(1).playerMove()) == Figure.WIN) {
                playerWinsNumber++;
            } else if (move.winWith(players.get(1).playerMove()) == Figure.LOSS) {
                computerWinsNumber++;
            }
        }
    }

    public void game() {
        while (!end) {
            stateOfGame();
            try {
                round();
            } catch (WrongSignException e) {
                System.out.println("Wrong sign!");
            } catch (NewGameException e) {
                newGame();
            } catch (EndGameException e) {
                endOfGame();
            }
            if (playerWinsNumber == roundsNumber || computerWinsNumber == roundsNumber) {
                System.out.println("Score: " + players.get(0).getPlayerName() + " - " + playerWinsNumber + "; "
                        + players.get(1).getPlayerName() + " - " + computerWinsNumber);
                if (playerWinsNumber > computerWinsNumber) {
                    System.out.println("You won the game!");
                } else {
                    System.out.println("You lost the game!");
                }
                newGame();
            }
        }
    }

    private void stateOfGame() {
        System.out.println("Score: " + players.get(0).getPlayerName() + " - " + playerWinsNumber + "; "
                + players.get(1).getPlayerName() + " - " + computerWinsNumber);
        System.out.println("1 - rock; 2 - paper; 3 - scissors; x - end of the game; n - new game");
    }

    public void newGame() {

        playerWinsNumber = 0;
        computerWinsNumber = 0;
        boolean correctString = false;
        while (!correctString){
            System.out.println("How many rounds would you like to play to? \nx - end of the game");
            String stringRoundsNumber = scanner.nextLine();
            if (stringRoundsNumber.equals(EXIT)) {
                correctString = true;
                endOfGame();
            }
            else {
                try {
                    roundsNumber = Integer.parseInt(stringRoundsNumber);
                    if (roundsNumber > 0) {
                        correctString = true;
                    } else {
                        System.out.println("Wrong sign! You must enter positive number.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Wrong sign! You must enter positive number.");
                }
            }
        }
    }

    private void endOfGame() {
        boolean endWhile = false;
        while (!endWhile) {
        System.out.println("Are you sure that you wont end this game? \ny - yes; n - no");
            String confirmation = scanner.nextLine();
            if (confirmation.equals(YES)) {
                end = true;
                endWhile = true;
                System.out.println("End of the game.");
            } else if (confirmation.equals(NO)) {
                endWhile = true;
            } else {
                System.out.println("Wrong sign!");
            }
        }
    }
}

