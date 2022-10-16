package main.java.connect4game.modelViewController.basic.view.console;

import main.java.connect4game.modelViewController.basic.controller.StartController;
import main.java.connect4game.modelViewController.basic.types.Message;

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
