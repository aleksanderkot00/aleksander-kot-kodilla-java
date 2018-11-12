package com.kodilla.rps;

import com.kodilla.rps.exceptions.EndGameException;
import com.kodilla.rps.exceptions.NewGameException;
import com.kodilla.rps.exceptions.WrongSignException;
import com.kodilla.rps.figures.Figure;
import com.kodilla.rps.players.Player;

import java.util.List;
import java.util.Scanner;


public class RpsGame {

    public static final String YES = "y";
    private List<Player> players;
    private int roundsNumber;
    private int playerWinsNumber = 0;
    private int computerWinsNumber = 0;
    private boolean end = false;
    private Scanner scanner = new Scanner(System.in);

    public RpsGame(List<Player> players, int roundsNumber) {
        this.players = players;
        this.roundsNumber = roundsNumber;
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
                end = true;
            }
        }
    }

    private void stateOfGame() {
        System.out.println("Score: " + players.get(0).getPlayerName() + " - " + playerWinsNumber + "; "
                + players.get(1).getPlayerName() + " - " + computerWinsNumber);
        System.out.println("1 - rock; 2 - paper; 3 - scissors; x - end of the game; n - new game");
    }

    private void newGame() {
        System.out.println("How many rounds would you like to play to?");
        roundsNumber = scanner.nextInt();
        playerWinsNumber = 0;
        computerWinsNumber = 0;
    }

    private void endOfGame() {
        System.out.println("Are you sure that you wont end this game? y - yes; n - no");
        if (scanner.nextLine().equals(YES)) {
            end = true;
            System.out.println("End of the game.");
        }
    }
}

