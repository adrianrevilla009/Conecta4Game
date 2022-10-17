package main.java.connect4game.modelViewController.facade.domain;

import main.java.connect4game.modelViewController.facade.types.Color;
import main.java.connect4game.modelViewController.facade.types.Error;

import java.util.ArrayList;
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

    void next() {
        if (!this.board.isConnect4(this.getActiveColor())) {
            if (this.board.getOccupiedCells() == 0) {
                this.activePlayer = this.whoStartsGame();
            } else {
                this.activePlayer = (this.activePlayer + 1) % Turn.NUMBER_PLAYERS;
            }
        }
    }

    int whoStartsGame() {
        return (int) ((Math.random() * (2 - 1)) + 1);
    }

    Player getActivePlayer() {
        return this.players.get(this.activePlayer);
    }

    Color getActiveColor() {
        return this.getActivePlayer().getColor();
    }

    void putToken(Cell cell) {
        this.getActivePlayer().putToken(cell);
    }

    Error getPutTokenError(Cell cell) {
        return this.getActivePlayer().getPutTokenError(cell);
    }
}
