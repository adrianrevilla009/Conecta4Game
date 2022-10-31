package org.example.modelViewController.withComposite.view.console.commands;

import org.example.modelViewController.withComposite.controller.PlayController;
import org.example.modelViewController.withComposite.utils.Command;
import org.example.modelViewController.withComposite.view.console.BoardView;

public abstract class CommandAction extends Command {

    protected PlayController playController;

    protected CommandAction(String title, PlayController playController) {
        super(title);
        this.playController = playController;
    }

    @Override
    public void execute() {
        new BoardView().write(this.playController);
    }

}
