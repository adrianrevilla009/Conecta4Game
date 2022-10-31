package org.example.modelViewController.facade.view.console;

import org.example.modelViewController.facade.controller.Logic;
import org.example.modelViewController.facade.view.WithLogicView;

public class PlayView extends WithLogicView {

    public PlayView(Logic logic) {
        super(logic);
    }

    public void interact() {
        do {
            new PlayerView(this.logic).interact();
            this.logic.next();
            new BoardView().write(this.logic);
        } while (!this.logic.isGameFinished());
        new MessageView().writeResult(this.logic);
    }
}
