package main.java.connect4game.modelViewPresenter.passiveView.controller;

import main.java.connect4game.modelViewPresenter.passiveView.domain.Game;
import main.java.connect4game.modelViewPresenter.passiveView.view.ViewFactory;

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
