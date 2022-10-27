package main.java.connect4game.modelViewController.withComposite.src.view.console;

import main.java.connect4game.modelViewController.withComposite.src.controller.PlayController;

public class PlayView {

    public void interact(PlayController playController) {
        do {
            new PlayMenu(playController).execute();
        } while (!playController.isGameFinished());
        new MessageView().writeResult(playController);
        playController.nextState(); // mediante el cambio de estado omitimos el flujo de control del play del connect4game
    }
}
