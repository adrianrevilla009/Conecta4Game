package main.java.connect4game.modelViewController.doubleDispatching.controller;

import main.java.connect4game.modelViewController.doubleDispatching.domain.Game;
import main.java.connect4game.modelViewController.doubleDispatching.domain.State;

public class ResumeController extends Controller {
    public ResumeController(Game game, State state) {
        super(game, state);
    }

    public void reset() {
        this.game.reset();
    }

    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }
}
