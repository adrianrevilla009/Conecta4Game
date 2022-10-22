package main.java.connect4game.modelViewController.withoutDoubleDispatching.controller;

import main.java.connect4game.modelViewController.withoutDoubleDispatching.domain.Game;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.domain.State;

public class ResumeController extends Controller {
    public ResumeController(Game game, State state) {
        super(game, state);
    }

    public void reset() {
        this.game.reset();
    }
}
