package main.java.connect4game.modelViewController.doubleDispatching.controller;

import main.java.connect4game.modelViewController.doubleDispatching.domain.Cell;
import main.java.connect4game.modelViewController.doubleDispatching.domain.Game;
import main.java.connect4game.modelViewController.doubleDispatching.domain.State;
import main.java.connect4game.modelViewController.doubleDispatching.types.Color;

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
