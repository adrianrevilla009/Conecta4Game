package main.java.connect4game.modelViewController.basic.controller;

import main.java.connect4game.modelViewController.basic.domain.Game;

public class ResumeController extends Controller{
    public ResumeController(Game game) {
        super(game);
    }

    public void reset() {
        this.game.reset();
    }
}
