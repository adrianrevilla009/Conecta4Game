package org.example.modelViewPresenter.refactorToPassiveView.controller;

import org.example.modelViewPresenter.refactorToPassiveView.domain.Game;
import org.example.modelViewPresenter.refactorToPassiveView.view.ViewFactory;

public class ResumeController extends Controller {
    public ResumeController(Game game, ViewFactory viewFactory) {
        super(game, viewFactory);
    }

    public void reset() {
        this.game.reset();
    }

    public boolean control() {
        boolean isResumed = this.viewFactory.createResumeView().read();
        if (isResumed) {
            this.game.reset();
        }
        return isResumed;
    }
}
