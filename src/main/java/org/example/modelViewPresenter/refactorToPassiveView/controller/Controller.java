package org.example.modelViewPresenter.refactorToPassiveView.controller;

import org.example.modelViewPresenter.refactorToPassiveView.view.console.BoardView;
import org.example.modelViewPresenter.refactorToPassiveView.view.ViewFactory;
import org.example.modelViewPresenter.refactorToPassiveView.domain.Cell;
import org.example.modelViewPresenter.refactorToPassiveView.domain.Game;
import org.example.modelViewPresenter.refactorToPassiveView.types.Color;

public abstract class Controller {
    protected Game game;

    protected ViewFactory viewFactory;

    Controller(Game game, ViewFactory viewFactory) {
        this.game = game;
        this.viewFactory = viewFactory;
    }

    void writeBoard() {
        BoardView boardView = this.viewFactory.createBoardView();
        for (int i = 0; i < Cell.ROWS; i++) {
            for (int j = 0; j < Cell.COLUMNS; j++) {
                boardView.set(this.game.getColor(new Cell(i, j)));
            }
        }
        boardView.write();
    }

    public Color getColor(Cell cell) {
        return this.game.getColor(cell);
    }

    public Game getGame() {
        return game;
    }
}
