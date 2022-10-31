package org.example.modelViewController.withoutDoubleDispatching.controller;

import org.example.modelViewController.withoutDoubleDispatching.domain.Cell;
import org.example.modelViewController.withoutDoubleDispatching.domain.Game;
import org.example.modelViewController.withoutDoubleDispatching.domain.State;
import org.example.modelViewController.withoutDoubleDispatching.types.Color;

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
