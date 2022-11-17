package org.example.modelViewPresenter.refactorToPassiveView;

import org.example.modelViewPresenter.refactorToPassiveView.controller.PlayController;
import org.example.modelViewPresenter.refactorToPassiveView.controller.ResumeController;
import org.example.modelViewPresenter.refactorToPassiveView.controller.StartController;
import org.example.modelViewPresenter.refactorToPassiveView.domain.Game;
import org.example.modelViewPresenter.refactorToPassiveView.view.View;

public abstract class Connect4Game {
    private Game game;
    private View view;

    public StartController startController;
    public PlayController playController;
    public ResumeController resumeController;

    public Connect4Game() {
        this.game = new Game();
        this.startController = new StartController(this.game);
        this.playController = new PlayController(this.game);
        this.resumeController = new ResumeController(this.game);
        this.view = this.createView();
    }

    public abstract View createView();

    public void play() {
        do {
            this.view.start();
            this.view.play();
        } while (this.view.resume());
    }
}
