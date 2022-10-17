package main.java.connect4game.modelViewController.facade.controller;

import main.java.connect4game.modelViewController.facade.domain.Game;

public class ResumeController extends Controller {
    public ResumeController(Game game) {
        super(game);
    }

    public void reset() {
        this.game.reset();
    }
}
