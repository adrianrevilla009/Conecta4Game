package org.example.modelViewPresenter.refactorToPassiveView.controller;

import org.example.modelViewPresenter.refactorToPassiveView.domain.Cell;
import org.example.modelViewPresenter.refactorToPassiveView.domain.Game;
import org.example.modelViewPresenter.refactorToPassiveView.types.Color;
import org.example.modelViewPresenter.refactorToPassiveView.types.Error;

public class PlayController extends Controller {
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

    public void reset() {
        this.game.reset();
    }


}
