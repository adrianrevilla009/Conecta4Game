package main.java.connect4game.modelViewPresenter.passiveView.controller;

import main.java.connect4game.modelViewPresenter.passiveView.domain.Cell;
import main.java.connect4game.modelViewPresenter.passiveView.domain.Game;
import main.java.connect4game.modelViewPresenter.passiveView.view.ViewFactory;
import main.java.connect4game.modelViewPresenter.passiveView.view.console.BoardView;

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
}
