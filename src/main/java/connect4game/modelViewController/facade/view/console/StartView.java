package main.java.connect4game.modelViewController.facade.view.console;

import main.java.connect4game.modelViewController.facade.controller.Logic;
import main.java.connect4game.modelViewController.facade.types.Message;
import main.java.connect4game.modelViewController.facade.view.WithLogicView;

public class StartView extends WithLogicView {

    public StartView(Logic logic) {
        super(logic);
    }

    public void interact() {
        new MessageView().writeln(Message.TITLE);
        new BoardView().write(this.logic);
    }
}
