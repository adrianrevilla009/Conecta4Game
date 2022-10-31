package org.example.modelViewPresenter.passiveView.controller;

import org.example.modelViewPresenter.passiveView.domain.Game;
import org.example.modelViewPresenter.passiveView.view.ViewFactory;

public class ResumeController extends Controller {
    public ResumeController(Game game, ViewFactory viewFactory) {
        super(game, viewFactory);
    }

    public boolean control() {
        boolean isResumed = this.viewFactory.createResumeView().read();
        if (isResumed) {
            this.game.reset();
        }
        return isResumed;
    }
}
