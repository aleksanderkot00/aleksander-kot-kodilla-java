package com.kodilla.rps;
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
        System.out.println("Hi " + playerName + "!\nHow many rounds would you like to play to?");
        int roundsNumber = scanner.nextInt();

        RpsGame rpsGame = new RpsGame(players, roundsNumber);
        rpsGame.game();

    }
}