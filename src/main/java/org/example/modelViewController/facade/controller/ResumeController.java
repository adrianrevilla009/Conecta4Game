package org.example.modelViewController.facade.controller;

import org.example.modelViewController.facade.domain.Game;

public class ResumeController extends Controller {
    public ResumeController(Game game) {
        super(game);
    }

    public void reset() {
        this.game.reset();
    }
}
