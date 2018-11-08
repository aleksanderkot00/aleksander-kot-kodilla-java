package com.kodilla.rps;

import java.util.List;


public class RpsGame {

    private List<Player> players;
    private int roundsNumber;
    private int playerWinsNumber = 0;
    private int computerWinsNumber = 0;
    private boolean end = false;

    public RpsGame(List<Player> players, int roundsNumber) {
        this.players = players;
        this.roundsNumber = roundsNumber;
    }

    private void round() {
        if ( players.size() > 1 ) {
            Figure move = players.get(0).playerMove();
            if ( move.WinWith(players.get(1).playerMove()) == Figure.WIN ) {
                playerWinsNumber++;
            } else if ( move.WinWith(players.get(1).playerMove()) == Figure.LOSE ) {
                computerWinsNumber++;
            }
        }
    }

    public void game() {
        while (!end) {
            stateOfGame();
            round();
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
}