package com.kodilla.rps;
import com.kodilla.rps.players.ComputerPlayer;
import com.kodilla.rps.players.Player;
import com.kodilla.rps.players.UserPlayer;

import java.util.*;

public class RpsRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Rock-paper-scissors game. \nWhat is your name?");
        String playerName = scanner.nextLine();
        Player player = new UserPlayer(playerName);
        Player computer = new ComputerPlayer();
        List<Player> players = new ArrayList<>();
        players.add(player);
        players.add(computer);

        boolean correctString = false;
        int roundsNumber = 0;
        while (!correctString){
            System.out.println("Hi " + playerName + "!\nHow many rounds would you like to play to?");
            String stringRoundsNumber = scanner.nextLine();
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

        RpsGame rpsGame = new RpsGame(players, roundsNumber);
        rpsGame.game();

    }
}