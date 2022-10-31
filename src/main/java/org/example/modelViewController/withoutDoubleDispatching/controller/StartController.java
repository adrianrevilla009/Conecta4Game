package org.example.modelViewController.withoutDoubleDispatching.controller;

import org.example.modelViewController.withoutDoubleDispatching.domain.Cell;
import org.example.modelViewController.withoutDoubleDispatching.domain.Game;
import org.example.modelViewController.withoutDoubleDispatching.domain.State;
import org.example.modelViewController.withoutDoubleDispatching.types.Color;

public class StartController extends Controller {
    public StartController(Game game, State state) {
        super(game, state);
    }

    public Color getColor(Cell cell) {
        return this.game.getColor(cell);
    }

}
