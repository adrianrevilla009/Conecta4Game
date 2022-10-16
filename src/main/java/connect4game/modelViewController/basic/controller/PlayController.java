package main.java.connect4game.modelViewController.basic.controller;

import main.java.connect4game.modelViewController.basic.domain.Cell;
import main.java.connect4game.modelViewController.basic.domain.Game;
import main.java.connect4game.modelViewController.basic.types.Color;
import main.java.connect4game.modelViewController.basic.types.Error;

public class PlayController extends Controller{
    public PlayController(Game game) {
        super(game);
    }

    public boolean isConnect4() {
        return this.game.isConnect4();
    }

    public void next() {
        this.game.next();
    }

    public Color getActiveColor() {
        return this.game.getActiveColor();
    }

    public void putToken(Cell cell) {
        this.game.putToken(new Cell(cell.getRow(), cell.getColumn()));
    }

    public Error getPutTokenError(Cell cell) {
        return this.game.getPutTokenError(cell);
    }

    public boolean isGameFinished() {
        return this.game.isGameFinished();
    }

    public int getNextFreeRow(Cell cell) {
        return this.game.getNextFreeRow(cell);
    }

    public int getOccupiedCells() {
        return this.game.getOccupiedCells();
    }


}
