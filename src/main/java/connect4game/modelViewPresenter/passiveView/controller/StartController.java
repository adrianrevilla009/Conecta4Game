package main.java.connect4game.modelViewPresenter.passiveView.controller;

import main.java.connect4game.modelViewPresenter.passiveView.domain.Game;
import main.java.connect4game.modelViewPresenter.passiveView.view.ViewFactory;

public class StartController extends Controller {
    public StartController(Game game, ViewFactory viewFactory) {
        super(game, viewFactory);
    }

    public void control() {
        this.viewFactory.createStartView().write();
        this.writeBoard();
    }
}
