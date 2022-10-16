package main.java.connect4game.modelViewController.basic.controller;

import main.java.connect4game.modelViewController.basic.domain.Cell;
import main.java.connect4game.modelViewController.basic.domain.Game;
import main.java.connect4game.modelViewController.basic.types.Color;

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
