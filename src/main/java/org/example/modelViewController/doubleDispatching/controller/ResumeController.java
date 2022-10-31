package org.example.modelViewController.doubleDispatching.controller;

import org.example.modelViewController.doubleDispatching.domain.Game;
import org.example.modelViewController.doubleDispatching.domain.State;

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
