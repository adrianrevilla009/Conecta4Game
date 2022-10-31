package org.example.modelViewController.basic.view.console;

import org.example.modelViewController.basic.controller.StartController;
import org.example.modelViewController.basic.types.Message;

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
