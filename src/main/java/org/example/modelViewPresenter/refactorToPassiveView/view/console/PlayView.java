package org.example.modelViewPresenter.refactorToPassiveView.view.console;

import org.example.modelViewPresenter.refactorToPassiveView.controller.PlayController;

public class PlayView {

    private PlayController playController;

    public PlayView(PlayController playController) {
        this.playController = playController;
    }

    public void interact() {
        do {
            new PlayerView(this.playController).interact();
            this.playController.next();
            new BoardView().write(this.playController);
        } while (!this.playController.isGameFinished());
        new MessageView().writeResult(this.playController);
    }
}
