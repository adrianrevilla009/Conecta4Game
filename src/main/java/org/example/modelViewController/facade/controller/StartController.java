package org.example.modelViewController.facade.controller;

import org.example.modelViewController.facade.domain.Cell;
import org.example.modelViewController.facade.domain.Game;
import org.example.modelViewController.facade.types.Color;

public class StartController extends Controller {
    public StartController(Game game) {
        super(game);
    }

    public Color getColor(Cell cell) {
        return this.game.getColor(cell);
    }

}
