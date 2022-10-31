package org.example.modelViewController.withoutDoubleDispatching.view.console;

import org.example.modelViewController.withoutDoubleDispatching.controller.StartController;
import org.example.modelViewController.withoutDoubleDispatching.types.Message;

public class StartView {

    public void interact(StartController startController) {
        new MessageView().writeln(Message.TITLE);
        new BoardView().write(startController);
        startController.nextState();
    }
}
