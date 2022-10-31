package org.example.modelViewPresenter.passiveView.controller;

import org.example.modelViewPresenter.passiveView.domain.Game;
import org.example.modelViewPresenter.passiveView.view.ViewFactory;

public class StartController extends Controller {
    public StartController(Game game, ViewFactory viewFactory) {
        super(game, viewFactory);
    }

    public void control() {
        this.viewFactory.createStartView().write();
        this.writeBoard();
    }
}
