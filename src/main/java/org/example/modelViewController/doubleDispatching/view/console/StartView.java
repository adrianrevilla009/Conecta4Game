package org.example.modelViewController.doubleDispatching.view.console;

import org.example.modelViewController.doubleDispatching.controller.StartController;
import org.example.modelViewController.doubleDispatching.types.Message;

public class StartView {

    public StartView() {}

    public void interact(StartController startController) {
        new MessageView().writeln(Message.TITLE);
        new BoardView().write(startController);
        startController.nextState(); // mediante el cambio de estado omitimos el flujo de control del play del connect4game
    }
}
