package main.java.connect4game.domain;

import java.util.Arrays;
import java.util.List;

public class InitialDraw {

    private Player player1;
    private Player player2;

    public InitialDraw(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    Player whoStartsGame() {
        List<Player> playerList = Arrays.asList(player1, player2);
        return playerList.get((int) ((Math.random() * (2 - 1)) + 1));
    }
}
