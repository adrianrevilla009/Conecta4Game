package main.java.connect4game.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        this.activePlayer = 0;
    }

    void play(){
        this.playerPlay();
        if (!this.board.isConnect4(this.getActiveColor())){
            this.activePlayer = (this.activePlayer+1) % Turn.NUMBER_PLAYERS;
        }
    }

    int whoStartsGame() {
        return (int) ((Math.random() * (2 - 1)) + 1);
    }

    void playerPlay() {
        // checks who start turn
        if (this.board.getOccupiedCells() == 0) {
            int startPlayerIndex = this.whoStartsGame();
            this.players.get(startPlayerIndex).play();
            this.activePlayer = startPlayerIndex;

        } else {
            this.players.get(this.activePlayer).play();
        }
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
