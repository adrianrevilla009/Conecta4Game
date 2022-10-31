package org.example.modelViewController.withoutDoubleDispatching.controller;

import org.example.modelViewController.withoutDoubleDispatching.domain.Game;
import org.example.modelViewController.withoutDoubleDispatching.domain.State;

public class ResumeController extends Controller {
    public ResumeController(Game game, State state) {
        super(game, state);
    }

    public void reset() {
        this.game.reset();
    }
}
