package org.example.modelViewController.doubleDispatching.controller;

import org.example.modelViewController.doubleDispatching.domain.Cell;
import org.example.modelViewController.doubleDispatching.domain.Game;
import org.example.modelViewController.doubleDispatching.domain.State;
import org.example.modelViewController.doubleDispatching.types.Color;

public class StartController extends Controller {
    public StartController(Game game, State state) {
        super(game, state);
    }

    public Color getColor(Cell cell) {
        return this.game.getColor(cell);
    }

    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

}
