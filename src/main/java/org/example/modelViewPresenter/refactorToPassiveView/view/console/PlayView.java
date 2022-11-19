package org.example.modelViewPresenter.refactorToPassiveView.view.console;

import org.example.modelViewPresenter.refactorToPassiveView.controller.PlayController;

public class PlayView {

    private PlayController playController;

    public PlayView(PlayController playController) {
        this.playController = playController;
    }
}
