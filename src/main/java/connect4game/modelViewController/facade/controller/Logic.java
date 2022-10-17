package main.java.connect4game.modelViewController.facade.controller;

import main.java.connect4game.modelViewController.facade.domain.Cell;
import main.java.connect4game.modelViewController.facade.domain.Game;
import main.java.connect4game.modelViewController.facade.types.Color;
import main.java.connect4game.modelViewController.facade.types.Error;

public class Logic {
    private Game game;
    public StartController startController;
    public PlayController playController;
    public ResumeController resumeController;

    public Logic(Game game) {
        this.game = game;
        this.startController = new StartController(this.game);
        this.playController = new PlayController(this.game);
        this.resumeController = new ResumeController(this.game);
    }

    public Color getColor(Cell cell) {
        return this.startController.getColor(cell);
    }

    public boolean isConnect4() {
        return this.playController.isConnect4();
    }

    public void next() {
        this.playController.next();
    }

    public Color getActiveColor() {
        return this.playController.getActiveColor();
    }

    public void putToken(Cell cell) {
        this.playController.putToken(new Cell(cell.getRow(), cell.getColumn()));
    }

    public Error getPutTokenError(Cell cell) {
        return this.playController.getPutTokenError(cell);
    }

    public boolean isGameFinished() {
        return this.playController.isGameFinished();
    }

    public int getNextFreeRow(Cell cell) {
        return this.playController.getNextFreeRow(cell);
    }

    public int getOccupiedCells() {
        return this.playController.getOccupiedCells();
    }

    public void reset() {
        this.playController.reset();
    }

    public void resume() {
        this.resumeController.reset();
    }

    public Game getGame() {
        return game;
    }

}
