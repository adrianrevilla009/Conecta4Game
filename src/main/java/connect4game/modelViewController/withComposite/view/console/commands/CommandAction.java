package main.java.connect4game.modelViewController.withComposite.view.console.commands;

import main.java.connect4game.modelViewController.withComposite.controller.PlayController;
import main.java.connect4game.modelViewController.withComposite.utils.Command;
import main.java.connect4game.modelViewController.withComposite.view.console.BoardView;

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
