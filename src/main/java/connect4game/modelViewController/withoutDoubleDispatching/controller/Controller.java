package main.java.connect4game.modelViewController.withoutDoubleDispatching.controller;

import main.java.connect4game.modelViewController.withoutDoubleDispatching.domain.Cell;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.domain.Game;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.domain.State;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.types.Color;

public abstract class Controller {
    protected Game game;
    protected State state;

    Controller(Game game, State state) {
        this.game = game;
        this.state = state;
    }
    public void nextState() {
        this.state.next();
    }

    public Color getColor(Cell cell) {
        return this.game.getColor(cell);
    }

}
