package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsGame {

    private String playerName;
    private int roundsNumber;
    private int playerWinsNumber = 0;
    private int computerWinsNumber = 0;
    private boolean end = false;
    private Scanner scanner = new Scanner(System.in);

    public RpsGame(String playerName, int roundsNumber) {
        this.playerName = playerName;
        this.roundsNumber = roundsNumber;
    }

    private void round(int computerMove, int playerMove) {
        if (playerMove == 1 && computerMove == 2) {
            computerWinsNumber++;
            System.out.println("Computer - paper; " + playerName + " - rock. Computer won this round.");
        }
        if (playerMove == 1 && computerMove == 3) {
            playerWinsNumber++;
            System.out.println("Computer - scissors; " + playerName + " - rock. " + playerName + " won this round.");
        }
        if (playerMove == 2 && computerMove == 1) {
            playerWinsNumber++;
            System.out.println("Computer - rock; " + playerName + " - paper. " + playerName + " won this round.");
        }
        if (playerMove == 2 && computerMove == 3) {
            computerWinsNumber++;
            System.out.println("Computer - scissors; " + playerName + " - paper. Computer won this round.");
        }
        if (playerMove == 3 && computerMove == 1) {
            computerWinsNumber++;
            System.out.println("Computer - rock; " + playerName + " - scissors. Computer won this round.");
        }
        if (playerMove == 3 && computerMove == 2) {
            playerWinsNumber++;
            System.out.println("Computer - paper; " + playerName + " - scissors. " + playerName + " won this round.");
        }
        if (playerMove == computerMove) {
            System.out.println("Draw!");
        }
    }

    public void game() {
        while (!end) {
            stateOfGame();
            String userChoice = scanner.nextLine();
            userChoiceChecker(userChoice);
        }
    }

    private void newGame() {
        System.out.println("How many rounds would you like to play to?");
        roundsNumber = scanner.nextInt();
        playerWinsNumber = 0;
        computerWinsNumber = 0;
    }

    private void endOfGame() {
        boolean rightSign = false;
        while (!rightSign) {
            System.out.println("Are you sure that you want end this game? y - yes; n - no");
            String choice = scanner.nextLine();
            if (choice.equals("y")) {
                end = true;
                System.out.println("End of the game.");
                rightSign = true;
            } else if (choice.equals("n")) {
                rightSign = true;
            } else {
                System.out.println("Wrong sign!");
            }
        }
    }

    private int computerMoveGenerator() {
        Random generator = new Random();
        return generator.nextInt(3) + 1;
    }

    private void stateOfGame() {
        System.out.println("\nScore: computer - " + computerWinsNumber + "; " + playerName + " - " + playerWinsNumber);
        System.out.println("1 - rock; 2 - paper; 3 - scissors; x - end of the game; n - new game");
    }

    private void userChoiceChecker(String userChoice) {
        if  ( userChoice.equals("1") || userChoice.equals("2") || userChoice.equals("3") ) {
            int userMove = Integer.parseInt(userChoice);
            round(computerMoveGenerator(), userMove);
            if (playerWinsNumber == roundsNumber || computerWinsNumber == roundsNumber) {
                System.out.println("Score: computer - " + computerWinsNumber + "; " + playerName + " - " + playerWinsNumber);
                if (playerWinsNumber > computerWinsNumber) {
                    System.out.println("You won the game!");
                }
                else {
                    System.out.println("You lost the game!");
                }
                boolean rightSign = false;
                while (!rightSign) {
                    System.out.println("Would you like to play again? y - yes; n - no");
                    String choice = scanner.nextLine();
                    if (choice.equals("y")) {
                        newGame();
                        rightSign = true;
                    } else if (choice.equals("n")) {
                        endOfGame();
                        rightSign = true;
                        if (!end) {
                            newGame();
                        }
                    } else {
                        System.out.println("Wrong sign!");
                    }
                }
            }
        } else if (userChoice.equals("x")) {
            endOfGame();
        } else if (userChoice.equals("n")) {
            newGame();
        } else {
            System.out.println("Wrong sign!");
        }
    }
}