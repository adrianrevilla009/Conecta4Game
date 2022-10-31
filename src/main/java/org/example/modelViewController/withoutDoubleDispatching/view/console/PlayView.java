package org.example.modelViewController.withoutDoubleDispatching.view.console;

import org.example.modelViewController.withoutDoubleDispatching.controller.Logic;
import org.example.modelViewController.withoutDoubleDispatching.controller.PlayController;
import org.example.modelViewController.withoutDoubleDispatching.view.WithLogicView;

public class PlayView {

    public void interact(PlayController playController) {
        do {
            new PlayerView(playController).interact();
            playController.next();
            new BoardView().write(playController);
        } while (!playController.isGameFinished());
        new MessageView().writeResult(playController);
    }
}
