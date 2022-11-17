package org.example.modelViewPresenter.refactorToPassiveView.controller;

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

    public Color getColor(Cell cell) {
        return this.game.getColor(cell);
    }

    public Game getGame() {
        return game;
    }
}
