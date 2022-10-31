package org.example.modelViewController.basic.controller;

import org.example.modelViewController.basic.domain.Game;

public class ResumeController extends Controller{
    public ResumeController(Game game) {
        super(game);
    }

    public void reset() {
        this.game.reset();
    }
}
