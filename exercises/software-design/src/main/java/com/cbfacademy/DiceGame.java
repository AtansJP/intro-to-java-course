package com.cbfacademy;

import com.cbfacademy.PlayerFactory;

public class DiceGame {
    private DicePlayer player1;
    private DicePlayer player2;
    private int targetScore = 30;

    public DiceGame() {
        player1 = PlayerFactory.create();
        player2 = PlayerFactory.create();
        player1.setName("Player 1");
        player2.setName("Player 2");
    }

    public String play() {
        int score1 = 0;
        int score2 = 0;
        String winner = null;

        System.out.println("Game started. Target score: " + targetScore);
        System.out.println();

        while (score1 < targetScore && score2 < targetScore) {
            score1 += player1.roll();
            score2 += player2.roll();
            System.out.println(player1.getName() + " score: " + score1);
            System.out.println(player2.getName() + " score: " + score2);
            System.out.println();
        }

        if (score1 > score2) {
            winner = player1.getName();
        } else if (score2 > score1) {
            winner = player2.getName();
        } else {
            winner = "It's a tie!";
        }

        return winner;
    }
}
