package org.example.modelViewPresenter.refactorToPassiveView;

import org.example.modelViewPresenter.refactorToPassiveView.controller.PlayController;
import org.example.modelViewPresenter.refactorToPassiveView.controller.ResumeController;
import org.example.modelViewPresenter.refactorToPassiveView.controller.StartController;
import org.example.modelViewPresenter.refactorToPassiveView.domain.Game;
import org.example.modelViewPresenter.refactorToPassiveView.view.View;
import org.example.modelViewPresenter.refactorToPassiveView.view.ViewFactory;

public abstract class Connect4Game {
    private Game game;
    private View view;
    private ViewFactory viewFactory;

    public static StartController startController;
    public static PlayController playController;
    public static ResumeController resumeController;

    public Connect4Game() {
        this.game = new Game();
        this.view = this.createView();
        this.viewFactory = this.createViewFactory();
        startController = new StartController(this.game, this.viewFactory);
        playController = new PlayController(this.game, this.viewFactory);
        resumeController = new ResumeController(this.game, this.viewFactory);
    }

    public abstract View createView();
    public abstract ViewFactory createViewFactory();
    public void play() {
        do {
            startController.control();
            playController.control();
        } while (resumeController.control());
    }
}
