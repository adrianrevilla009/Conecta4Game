package org.example.modelViewPresenter.refactorToPassiveView.view.console;

import org.example.modelViewPresenter.refactorToPassiveView.controller.StartController;
import org.example.modelViewPresenter.refactorToPassiveView.types.Message;

public class StartView {

    private StartController startController;

    public StartView(StartController startController) {
        this.startController = startController;
    }

    public void interact() {
        new MessageView().writeln(Message.TITLE);
        new BoardView().write(this.startController);
    }
}
