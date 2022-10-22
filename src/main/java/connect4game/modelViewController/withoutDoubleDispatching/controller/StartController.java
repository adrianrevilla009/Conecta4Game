package main.java.connect4game.modelViewController.withoutDoubleDispatching.controller;

import main.java.connect4game.modelViewController.withoutDoubleDispatching.domain.Cell;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.domain.Game;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.domain.State;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.types.Color;

public class StartController extends Controller {
    public StartController(Game game, State state) {
        super(game, state);
    }

    public Color getColor(Cell cell) {
        return this.game.getColor(cell);
    }

}
