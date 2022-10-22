package main.java.connect4game.modelViewController.doubleDispatching.domain;

import main.java.connect4game.modelViewController.doubleDispatching.types.Color;
import main.java.connect4game.modelViewController.doubleDispatching.types.Error;

public class Game {
    private Board board;
    private Turn turn;

    public Game() {
        this.board = new Board();
        this.turn = new Turn(this.board);
    }

    public void reset() {
        this.board.reset();
        this.turn.reset();
    }

    public void next() {
        this.turn.next();
    }

    public Color getActiveColor() {
        return this.turn.getActiveColor();
    }

    public boolean isGameFinished() {
        return this.isConnect4() || this.isEqualGame();
    }

    public boolean isConnect4() {
        return this.board.isConnect4(this.turn.getActiveColor());
    }

    public boolean isEqualGame() {
        return this.board.isEqualGame();
    }

    public Color getColor(Cell cell) {
        return this.board.getColor(cell);
    }

    public int getOccupiedCells() {
        return this.board.getOccupiedCells();
    }

    public void putToken(Cell cell) {
        this.turn.putToken(cell);
    }

    public Error getPutTokenError(Cell cell) {
        return this.turn.getPutTokenError(cell);
    }

    public int getNextFreeRow(Cell cell) {
        return this.board.getNextFreeRow(cell);
    }
}
