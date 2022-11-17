package org.example.modelViewPresenter.refactorToPassiveView.controller;

import org.example.modelViewPresenter.refactorToPassiveView.domain.Game;

public class ResumeController extends Controller {
    public ResumeController(Game game) {
        super(game);
    }

    public void reset() {
        this.game.reset();
    }
}
