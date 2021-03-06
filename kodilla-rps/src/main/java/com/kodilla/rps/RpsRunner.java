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

        RpsGame rpsGame = new RpsGame(players);
        rpsGame.newGame();
        rpsGame.game();

    }
}