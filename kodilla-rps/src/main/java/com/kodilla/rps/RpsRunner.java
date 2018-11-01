package com.kodilla.rps;
import java.util.Scanner;
public class RpsRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rock-paper-scissors game. \nWhat is your name?");
        String playerName = scanner.nextLine();
        System.out.println("Hi " + playerName + "!\nHow many rounds would you like to play to?");
        int roundsNumber = scanner.nextInt();
        RpsGame rpsGame = new RpsGame(playerName, roundsNumber);
        rpsGame.game();
    }
}