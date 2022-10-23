package main.java.connect4game.modelViewController.withComposite.view.console;

import main.java.connect4game.modelViewController.withComposite.controller.StartController;
import main.java.connect4game.modelViewController.withComposite.types.Message;

public class StartView {

    public StartView() {}

    public void interact(StartController startController) {
        new MessageView().writeln(Message.TITLE);
        new BoardView().write(startController);
        startController.nextState(); // mediante el cambio de estado omitimos el flujo de control del play del connect4game
    }
}
