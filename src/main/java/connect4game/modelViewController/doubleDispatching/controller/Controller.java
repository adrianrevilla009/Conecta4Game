package main.java.connect4game.modelViewController.doubleDispatching.controller;

import main.java.connect4game.modelViewController.doubleDispatching.domain.Cell;
import main.java.connect4game.modelViewController.doubleDispatching.domain.Game;
import main.java.connect4game.modelViewController.doubleDispatching.domain.State;
import main.java.connect4game.modelViewController.doubleDispatching.types.Color;

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

    public Game getGame() {
        return game;
    }

    public abstract void accept(ControllersVisitor controllersVisitor);
}
