package main.java.connect4game.modelViewController.withoutDoubleDispatching.view.console;

import main.java.connect4game.modelViewController.withoutDoubleDispatching.controller.Logic;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.controller.PlayController;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.view.WithLogicView;

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
