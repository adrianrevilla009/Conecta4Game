package main.java.connect4game.modelViewController.facade.controller;

import main.java.connect4game.modelViewController.facade.domain.Cell;
import main.java.connect4game.modelViewController.facade.domain.Game;
import main.java.connect4game.modelViewController.facade.types.Color;

public class StartController extends Controller {
    public StartController(Game game) {
        super(game);
    }

    public Color getColor(Cell cell) {
        return this.game.getColor(cell);
    }

}
