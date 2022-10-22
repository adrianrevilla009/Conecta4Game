package main.java.connect4game.modelViewController.doubleDispatching.view.console;

import main.java.connect4game.modelViewController.doubleDispatching.controller.PlayController;

public class PlayView {

    public void interact(PlayController playController) {
        do {
            new PlayerView(playController).interact();
            playController.next();
            new BoardView().write(playController);
        } while (!playController.isGameFinished());
        new MessageView().writeResult(playController);
        playController.nextState(); // mediante el cambio de estado omitimos el flujo de control del play del connect4game
    }
}
