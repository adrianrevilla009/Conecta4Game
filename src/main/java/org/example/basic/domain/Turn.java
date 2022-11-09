package org.example.basic.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Turn {
    private Board board;
    static final int NUMBER_PLAYERS = 2;
    private List<Player> players;
    private int activePlayer;

    Turn(Board board) {
        assert board != null;
        this.board = board;
        this.players = new ArrayList<>(NUMBER_PLAYERS);
        this.reset();
    }

    void reset() {
        for (int i = 0; i < NUMBER_PLAYERS; i++) {
            Player player = new Player(Color.get(i), this.board);
            this.players.add(player);
        }
        this.activePlayer = this.whoStartsGame();
    }

    void play(){
        this.players.get(this.activePlayer).play();
        if (!this.board.isWinner()) {
            this.activePlayer = (this.activePlayer+1) % Turn.NUMBER_PLAYERS;
        }
    }

    int whoStartsGame() {
        return new Random().nextInt(1 + 1);
    }

    void writeWinner(){
        this.players.get(this.activePlayer).writeWinner();
    }

    void writeEqualGame() {
        Message.EQUAL_GAME.writeln();
    }

    Color getActiveColor() {
        return this.players.get(this.activePlayer).getColor();
    }
}
