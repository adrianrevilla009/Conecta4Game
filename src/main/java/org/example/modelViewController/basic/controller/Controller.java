package org.example.modelViewController.basic.controller;

import org.example.modelViewController.basic.domain.Cell;
import org.example.modelViewController.basic.domain.Game;
import org.example.modelViewController.basic.types.Color;

public abstract class Controller {
    protected Game game;

    Controller(Game game) {
        this.game = game;
    }

    public Color getColor(Cell cell) {
        return this.game.getColor(cell);
    }

    public Game getGame() {
        return game;
    }
}
