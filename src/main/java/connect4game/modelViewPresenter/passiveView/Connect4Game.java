package main.java.connect4game.modelViewPresenter.passiveView;

import main.java.connect4game.modelViewPresenter.passiveView.controller.PlayController;
import main.java.connect4game.modelViewPresenter.passiveView.controller.ResumeController;
import main.java.connect4game.modelViewPresenter.passiveView.controller.StartController;
import main.java.connect4game.modelViewPresenter.passiveView.domain.Game;
import main.java.connect4game.modelViewPresenter.passiveView.view.ViewFactory;

public abstract class Connect4Game {
    private Game game;
    private ViewFactory viewFactory;

    public StartController startController;
    public PlayController playController;
    public ResumeController resumeController;

    public Connect4Game() {
        this.game = new Game();
        this.viewFactory = this.createViewFactory();
        this.startController = new StartController(this.game, this.viewFactory);
        this.playController = new PlayController(this.game, this.viewFactory);
        this.resumeController = new ResumeController(this.game, this.viewFactory);
    }

    public abstract ViewFactory createViewFactory();

    public void play() {
        do {
            this.startController.control();
            this.playController.control();
        } while (this.resumeController.control());
    }
}
