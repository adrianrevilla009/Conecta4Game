package org.example.modelViewController.facade.view.console;

import org.example.modelViewController.facade.controller.Logic;
import org.example.modelViewController.facade.types.Message;
import org.example.modelViewController.facade.view.WithLogicView;

public class StartView extends WithLogicView {

    public StartView(Logic logic) {
        super(logic);
    }

    public void interact() {
        new MessageView().writeln(Message.TITLE);
        new BoardView().write(this.logic);
    }
}
