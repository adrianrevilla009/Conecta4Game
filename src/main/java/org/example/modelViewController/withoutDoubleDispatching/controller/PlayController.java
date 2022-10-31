package org.example.modelViewController.withoutDoubleDispatching.controller;

import org.example.modelViewController.withoutDoubleDispatching.domain.Cell;
import org.example.modelViewController.withoutDoubleDispatching.domain.Game;
import org.example.modelViewController.withoutDoubleDispatching.domain.State;
import org.example.modelViewController.withoutDoubleDispatching.types.Color;
import org.example.modelViewController.withoutDoubleDispatching.types.Error;

public class PlayController extends Controller {
    public PlayController(Game game, State state) {
        super(game, state);
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

    public void reset() {
        this.game.reset();
    }


}
