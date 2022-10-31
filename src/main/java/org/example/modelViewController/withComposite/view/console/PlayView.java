package org.example.modelViewController.withComposite.view.console;

import org.example.modelViewController.withComposite.controller.PlayController;

public class PlayView {

    public void interact(PlayController playController) {
        do {
            new PlayMenu(playController).execute();
        } while (!playController.isGameFinished());
        new MessageView().writeResult(playController);
        playController.nextState(); // mediante el cambio de estado omitimos el flujo de control del play del connect4game
    }
}
