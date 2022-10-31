package org.example.modelViewController.doubleDispatching.controller;

import org.example.modelViewController.doubleDispatching.domain.Cell;
import org.example.modelViewController.doubleDispatching.domain.Game;
import org.example.modelViewController.doubleDispatching.domain.State;
import org.example.modelViewController.doubleDispatching.types.Color;

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
