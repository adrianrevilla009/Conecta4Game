package main.java.connect4game.modelViewController.withoutDoubleDispatching.view.console;

import main.java.connect4game.modelViewController.withoutDoubleDispatching.controller.StartController;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.types.Message;

public class StartView {

    public void interact(StartController startController) {
        new MessageView().writeln(Message.TITLE);
        new BoardView().write(startController);
        startController.nextState();
    }
}
